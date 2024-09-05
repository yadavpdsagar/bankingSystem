package com.bank.demo.Controller;


import com.bank.demo.Model.TransactionDetail;
import com.bank.demo.service.TransactionDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
@RequestMapping("/transactions")
public class BankTransactionController {

 @Autowired
     TransactionDetailService transactionDetailService;

//        @PostMapping("/process")
//        public TransactionDetail processTransaction(@RequestBody TransactionDetail transactionDetail  ) {
//            return transactionDetailService.saveTransaction(transactionDetail  );
//        }
//    }

    @PostMapping("/process")
public ModelAndView processTransaction (TransactionDetail transactionReq  , Model model){
        TransactionDetail transactionDetail = transactionDetailService.saveTransaction(transactionReq );
        return new ModelAndView("Success");
    }
}

/*
* @RestController
@RequestMapping("/api/transactions")
public class TransactionDetailController {

    @Autowired
    private TransactionDetailService transactionDetailService;

    @PostMapping
    public ResponseEntity<TransactionDetail> createTransaction(@RequestBody TransactionDetail transactionDetail) {
        TransactionDetail savedTransaction = transactionDetailService.saveTransaction(transactionDetail);
        return ResponseEntity.ok(savedTransaction);
    }
}
* */
