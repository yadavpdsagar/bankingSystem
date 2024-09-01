package com.bank.demo.service;

import com.bank.demo.DTO.AccountDetailReqRes;
import com.bank.demo.Model.AccountDetail;
import com.bank.demo.Model.AccountType;
import com.bank.demo.Repository.AccountDetialsRepo;
import com.bank.demo.Repository.AccountTypeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;



@Component
@Service
public class AccountDetialsService {
    @Autowired
    private AccountDetialsRepo accountDetialsRepo;

    @Autowired
    private AccountTypeRepo accountTypeRepo;
    @Autowired
    AccountType accountType;

//    @Autowired
//    private TransactionDetailRepo transactionDetailRepo;

//    public AccountDetailReqRes AccountRegistration(AccountDetailReqRes accountDetailReqRes){
//        AccountDetail accountDetail = new AccountDetail();
//
//
//
//       try{
//           accountDetail.setAddress(accountDetail.getAddress());
//           accountDetail.setBalance(accountDetail.getBalance());
//           accountDetail.setName(accountDetail.getName());
//
//           accountDetail.setAccountType(accountDetail.getAccountType());
//
//
//           AccountDetail accountDetailResult = accountDetialsRepo.save(accountDetail);
//           if(accountDetailResult.getAccountNumber()!=null){
//               accountDetailReqRes.setAccountDetail(accountDetailResult);
//           }
//
//       } catch (Exception e) {
//           accountDetailReqRes.setStatusCode(500);
//           accountDetailReqRes.setError(e.getMessage());
//       }
//return accountDetailReqRes;
//    }
//----------------------------------------------------------------------------------------------------------------
//  public AccountDetail AccountRegistration(AccountDetail accountDetail){
//      // Save tags if not already saved
//      List<AccountType> saveaccountTypes = new ArrayList<>();
//      for(AccountType accountType : accountDetail.getAccountType()){
//          // Check if the tag already exists
//          AccountType existAccounttype = AccountTypeRepo.findById(Integer.valueOf( Integer accountType.getAccTyp());
//          if(existAccounttype!=null){
//              saveaccountTypes .add(existAccounttype);
//          }else {
//              saveaccountTypes .add(accountTypeRepo.save(accountType));
//          }
//      }
//      accountDetail.setTransactionDetails(saveaccountTypes);
//
//      return accountDetialsRepo.save(accountDetail);
//  }
//----------------------------------------------------------------------------------------------------------------
//    public AccountDetail AccountRegistration(AccountDetail accountDetail , String AccTypId){
//
//     Optional<AccountType> accountType1 = accountTypeRepo.findById(AccTypId);
//
//        accountDetail.getAccountType().setAccTyp(accountDetail.getAccountType().getAccTypId());
//
//        return accountDetialsRepo.save(accountDetail);
//    }


//
//    public AccountDetail AccountRegistration(AccountDetail accountDetail) {
//        // Fetch the account type
//        AccountType accountType = accountDetail.getAccountType();
//        AccountType savedAccountType;
//
//        // Check if the account type already exists
//        Optional<AccountType> existAccountType = accountTypeRepo.findById(accountType.getAccTypId());
////        Optional<AccountType> existAccountType = AccountTypeRepo.findById(Integer.valueOf(accountType.getAccTypId()));
//        if (existAccountType.isPresent()) {
//            savedAccountType = existAccountType.get();
//        } else {
//            savedAccountType = accountTypeRepo.save(accountType);
//        }
//
//        // Set the saved account type in accountDetail
//        accountDetail.setAccountType(savedAccountType);
//
//        // Save and return the accountDetail
//        return accountDetialsRepo.save(accountDetail);
//    }
//




    public AccountDetail AccountRegistration(AccountDetail accountDetail, String accTypId) {
        Optional<AccountType> accountTypeOptional = accountTypeRepo.findById(accTypId);

        if (accountTypeOptional.isPresent()) {
            AccountType accountType = accountTypeOptional.get();
            accountDetail.setAccountType(accountType);
        } else {
            throw new RuntimeException("Account Type not found");
        }

        return accountDetialsRepo.save(accountDetail);
    }






}
