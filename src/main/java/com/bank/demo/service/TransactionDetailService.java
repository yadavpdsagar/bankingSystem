package com.bank.demo.service;

import com.bank.demo.Model.*;
import com.bank.demo.Repository.AccountDetialsRepo;
import com.bank.demo.Repository.LedgerRepo;
import com.bank.demo.Repository.TransactionDetailRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionDetailService {

    @Autowired
    private TransactionDetailRepo transactionDetailRepo;

    @Autowired
    private AccountDetialsRepo accountDetialsRepo;
    @Autowired
   private LedgerRepo ledgerRepo;


    @Transactional
    public TransactionDetail saveTransaction(TransactionDetail transactionDetail) {

        try{
            // Retrieve the AccountDetail entity using the account number from transactionDetail
            AccountDetail accountDetail = accountDetialsRepo.findByaccountNumber(transactionDetail.getAccountDetail().getAccountNumber())
                    .orElseThrow(() -> new RuntimeException("Account not found"));
            AccountType accountType= accountDetail.getAccountType();
            Ledger ledger = ledgerRepo.findById(accountType.getLedger().getLedgerId()).orElseThrow(()-> new RuntimeException("ledger not found"));


            // Update the balance based on the transaction type
            if (transactionDetail.getTransactionType() == TransactionType.DEPOSIT ) {
                accountDetail.setBalance(accountDetail.getBalance() + transactionDetail.getTransactionAmount());
             ledger.setTotalAmount(ledger.getTotalAmount()+transactionDetail.getTransactionAmount());

            } else if (transactionDetail.getTransactionType() == TransactionType.WITHDRAWAL) {

                if (accountDetail.getBalance() < transactionDetail.getTransactionAmount()) {
                    throw new RuntimeException("Insufficient balance");
                }
                accountDetail.setBalance(accountDetail.getBalance() - transactionDetail.getTransactionAmount());
                ledger.setTotalAmount(ledger.getTotalAmount()-transactionDetail.getTransactionAmount());
            }

            // Save the updated account detail
            accountDetialsRepo.save(accountDetail);
            // Save the updated ledger
            ledgerRepo.save(ledger);

        } catch (Exception e) {
           System.out.println(e.getMessage());
        }


        // Save the transaction detail
        return transactionDetailRepo.save(transactionDetail);
    }



}


