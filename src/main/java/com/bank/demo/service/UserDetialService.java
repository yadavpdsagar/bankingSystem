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
         userDetail.setEmail(userRegisterRequest.getEmail());
         userDetail.setPassword(userRegisterRequest.getPassword());
         userDetail.setRole(userRegisterRequest.getRole());
            UserDetail userDetailResult = userDetialRepo.save(userDetail);
            if(userDetailResult.getUserId()>0){
                userDetialsReqRes.setUserDetail(userDetail);
            }



        } catch (Exception e) {
            userDetialsReqRes.setStatusCode(500);
            userDetialsReqRes.setError(e.getMessage());
        }
        return userDetialsReqRes;
    }
    
    
    
    public List<UserDetail>  getAllUserDetial(){
    	return userDetialRepo.findAll();
    }






}
