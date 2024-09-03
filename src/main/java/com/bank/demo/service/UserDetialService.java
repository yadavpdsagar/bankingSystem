package com.bank.demo.service;

import com.bank.demo.DTO.UserDetialsReqRes;
import com.bank.demo.Model.UserDetail;
import com.bank.demo.Repository.UserDetialRepo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDetialService {
    @Autowired
    private UserDetialRepo userDetialRepo;


    public UserDetialsReqRes userRegistration( UserDetialsReqRes userRegisterRequest){
        UserDetialsReqRes userDetialsReqRes= new UserDetialsReqRes();
        try{
            UserDetail userDetail = new UserDetail();
         userDetail.setUserName(userRegisterRequest.getUserName());
         userDetail.setEmail(userDetail.getEmail());
         userDetail.setPassword(userDetail.getPassword());
         userDetail.setRole(userDetail.getRole());
            UserDetail userDetailResult = userDetialRepo.save(userDetail);
            if(userDetailResult.getUserId()>0){
                userDetialsReqRes.setUserDetail(userDetailResult);
            }



        } catch (Exception e) {
            userDetialsReqRes.setStatusCode(500);
            userDetialsReqRes.setError(e.getMessage());
        }
        return userDetialsReqRes;
    }

    public UserDetialsReqRes getAllUserDetial(){
        UserDetialsReqRes userDetialsReqRes = new UserDetialsReqRes();
   try{
       List<UserDetail> result = userDetialRepo.findAll();
       if(!result.isEmpty()){
           userDetialsReqRes.setUserDetailList(result);
           userDetialsReqRes.setStatusCode(200);
           userDetialsReqRes.setMessage("successfull");
       }else {
           userDetialsReqRes.setStatusCode(404);
           userDetialsReqRes.setMessage("no user found");
       }
       return userDetialsReqRes;
   } catch (Exception e) {
       userDetialsReqRes.setStatusCode(500);
       userDetialsReqRes.setMessage("error occured:"+e.getMessage());
       return userDetialsReqRes;
   }
    }





}
