package com.bank.demo.Controller;

import com.bank.demo.DTO.AccountDetailReqRes;
import com.bank.demo.Model.AccountDetail;
import com.bank.demo.Model.AccountType;
import com.bank.demo.service.AccountDetialsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountRegistrationController {
    @Autowired
    private AccountDetialsService accountDetialsService;



    @PostMapping("/createacc")
    public AccountDetail createAccount(@RequestBody AccountDetail accountDetail) {
        return accountDetialsService.AccountRegistration(accountDetail, accountDetail.getAccountType().getAccTypId());
    }


}
