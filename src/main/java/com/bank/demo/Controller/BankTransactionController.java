package com.bank.demo.Controller;


import com.bank.demo.Model.TransactionDetail;
import com.bank.demo.service.TransactionDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/transactions")
public class BankTransactionController {

 @Autowired
     TransactionDetailService transactionDetailService;

        @PostMapping("/process")
        public TransactionDetail processTransaction(@RequestBody TransactionDetail transactionDetail  ) {
            return transactionDetailService.saveTransaction(transactionDetail  );
        }
    }

