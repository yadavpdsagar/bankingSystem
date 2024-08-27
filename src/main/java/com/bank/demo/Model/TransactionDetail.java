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
    private  Integer TransactionId;

    @Enumerated(EnumType.STRING  )
private TransactionType transactionType;

    private Long TransactionAmount;

    @ManyToOne
    private AccountDetail accountDetail;






}
