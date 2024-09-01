package com.bank.demo.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TransactionDetail {

@Id
@GeneratedValue
    private  Integer TransactionId;
 private  String name;

    @Enumerated(EnumType.STRING  )
private TransactionType transactionType;

    private Long TransactionAmount;

    @ManyToOne
    @JoinColumn(name = "account_detail_id")
    private AccountDetail accountDetail;






}
