package com.bank.demo.Controller;

import com.bank.demo.DTO.AccountDetailReqRes;
import com.bank.demo.Model.AccountDetail;
import com.bank.demo.Model.AccountType;
import com.bank.demo.service.AccountDetialsService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class AccountRegistrationController {
    @Autowired
    private AccountDetialsService accountDetialsService;





    @PostMapping("/admin/createacc")
  public ModelAndView createAccount (AccountDetail  accountReq , Model model){
        AccountDetail accountDetail = accountDetialsService.AccountRegistration(accountReq , accountReq.getAccountType().getAccTypId());
        return new ModelAndView("AccountRegistrationPage");
    }
    
    
   @GetMapping("/adminemployee/accountdetialslist")
   public List<AccountDetail> accountDetailsList(){
	   return accountDetialsService.getAccountDetails();
   }
    
}
