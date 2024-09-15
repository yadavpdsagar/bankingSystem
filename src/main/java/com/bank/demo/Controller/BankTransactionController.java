package com.bank.demo.Controller;


import com.bank.demo.Model.TransactionDetail;
import com.bank.demo.service.TransactionDetailService;

import jakarta.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@RestController
@RequestMapping
public class BankTransactionController {

 @Autowired
     TransactionDetailService transactionDetailService;




    @PostMapping("/employee/process")
public ModelAndView processTransaction (TransactionDetail transactionReq  , HttpSession session,Model model){
    	 String userId  = session.getId();
        TransactionDetail transactionDetail = transactionDetailService.saveTransaction(transactionReq );
        return new ModelAndView("employeeSuccess");
    }

    @GetMapping("/adminemployee/tractionListget")
    public List<TransactionDetail> tractionList(){
        return transactionDetailService.getAllTraction();
    }
}


