package com.bank.demo.service;

import com.bank.demo.DTO.AccountDetailReqRes;
import com.bank.demo.Model.AccountDetail;
import com.bank.demo.Model.UserDetail;
import com.bank.demo.Repository.AccountDetialsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountDetialsService {
    @Autowired
    private AccountDetialsRepo accountDetialsRepo;

    public AccountDetailReqRes AccountRegistration(AccountDetailReqRes accountDetailReqRes){
        AccountDetail accountDetail = new AccountDetail();



       try{
           accountDetail.setAddress(accountDetail.getAddress());
           accountDetail.setBalance(accountDetail.getBalance());
           accountDetail.setAccountType(accountDetail.getAccountType());


           AccountDetail accountDetailResult = accountDetialsRepo.save(accountDetail);
           if(accountDetailResult.getAccountNumber()!=null){
               accountDetailReqRes.setAccountDetail(accountDetailResult);
           }

       } catch (Exception e) {
           accountDetailReqRes.setStatusCode(500);
           accountDetailReqRes.setError(e.getMessage());
       }
return accountDetailReqRes;
    }


}
