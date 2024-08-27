package com.bank.demo.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AccountDetail {


    @Id
    private String accountNumber;

    @PrePersist
    protected void onCreate() {
        this.accountNumber = generateAccountNumber();
    }

    private String generateAccountNumber() {
        String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        return "ACC-" + timestamp + "-" + (int) (Math.random() * 10000);
    }

    private String Address;

    private Long balance;
    @OneToOne(mappedBy = "accountDetail" , cascade = CascadeType.ALL)
    private UserDetail userDetail;

    @ManyToOne
    @JoinColumn(name = "AccTypId")
    private AccountType accountType;

    @OneToMany(mappedBy = "accountDetail")
    private List<TransactionDetail> transactionDetail = new ArrayList<>();

}
