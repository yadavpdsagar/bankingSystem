package com.bank.demo.Controller;


import com.bank.demo.Model.TransactionDetail;
import com.bank.demo.service.TransactionDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@RestController
@RequestMapping("/transactions")
public class BankTransactionController {

 @Autowired
     TransactionDetailService transactionDetailService;




    @PostMapping("/process")
public ModelAndView processTransaction (TransactionDetail transactionReq  , Model model){
        TransactionDetail transactionDetail = transactionDetailService.saveTransaction(transactionReq );
        return new ModelAndView("Success");
    }

    @GetMapping("/tractionListget")
    public List<TransactionDetail> tractionList(){
        return transactionDetailService.getAllTraction();
    }
}


