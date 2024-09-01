package com.bank.demo.service;

import com.bank.demo.Model.AccountDetail;
import com.bank.demo.Model.TransactionDetail;
import com.bank.demo.Model.TransactionType;
import com.bank.demo.Repository.AccountDetialsRepo;
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


    @Transactional
    public TransactionDetail saveTransaction(TransactionDetail transactionDetail) {

        try{
            // Retrieve the AccountDetail entity using the account number from transactionDetail
            AccountDetail accountDetail = accountDetialsRepo.findByaccountNumber(transactionDetail.getAccountDetail().getAccountNumber())
                    //  Optional<AccountType> accountTypeOptional = accountTypeRepo.findById(accTypId);
                    .orElseThrow(() -> new RuntimeException("Account not found"));

            // Update the balance based on the transaction type
            if (transactionDetail.getTransactionType() == TransactionType.DEPOSIT ) {
                accountDetail.setBalance(accountDetail.getBalance() + transactionDetail.getTransactionAmount());
            } else if (transactionDetail.getTransactionType() == TransactionType.WITHDRAWAL) {

                if (accountDetail.getBalance() < transactionDetail.getTransactionAmount()) {
                    throw new RuntimeException("Insufficient balance");
                }
                accountDetail.setBalance(accountDetail.getBalance() - transactionDetail.getTransactionAmount());
            }

            // Save the updated account detail
            accountDetialsRepo.save(accountDetail);

        } catch (Exception e) {
           System.out.println(e.getMessage());
        }


        // Save the transaction detail
        return transactionDetailRepo.save(transactionDetail);
    }



}


/*
@Service
public class TransactionDetailService {

    @Autowired
    private TransactionDetailRepository transactionDetailRepository;

    @Autowired
    private AccountDetailRepository accountDetailRepository;

    @Transactional
    public TransactionDetail saveTransaction(TransactionDetail transactionDetail) {
        AccountDetail accountDetail = transactionDetail.getAccountDetail();

        // Update the balance based on the transaction type
        if (transactionDetail.getTransactionType() == TransactionType.DEPOSIT) {
            accountDetail.setBalance(accountDetail.getBalance() + transactionDetail.getTransactionAmount());
        } else if (transactionDetail.getTransactionType() == TransactionType.WITHDRAWAL) {
            accountDetail.setBalance(accountDetail.getBalance() - transactionDetail.getTransactionAmount());
        }

        // Save the updated account detail
        accountDetailRepository.save(accountDetail);

        // Save the transaction detail
        return transactionDetailRepository.save(transactionDetail);
    }
}
*/

//-----------------------------------------------------------------------///
/*
@Service
public class TransactionDetailService {

    @Autowired
    private TransactionDetailRepository transactionDetailRepository;

    @Autowired
    private AccountDetailRepository accountDetailRepository;

    @Transactional
    public TransactionDetail saveTransaction(TransactionDetail transactionDetail) {
        // Retrieve the AccountDetail entity using the account number from transactionDetail
        AccountDetail accountDetail = accountDetailRepository.findById(transactionDetail.getAccountDetail().getAccountNumber())
                .orElseThrow(() -> new RuntimeException("Account not found"));

        // Update the balance based on the transaction type
        if (transactionDetail.getTransactionType() == TransactionType.DEPOSIT) {
            accountDetail.setBalance(accountDetail.getBalance() + transactionDetail.getTransactionAmount());
        } else if (transactionDetail.getTransactionType() == TransactionType.WITHDRAWAL) {
            if (accountDetail.getBalance() < transactionDetail.getTransactionAmount()) {
                throw new RuntimeException("Insufficient balance");
            }
            accountDetail.setBalance(accountDetail.getBalance() - transactionDetail.getTransactionAmount());
        }

        // Save the updated account detail
        accountDetailRepository.save(accountDetail);

        // Save the transaction detail
        return transactionDetailRepository.save(transactionDetail);
    }
}
*/