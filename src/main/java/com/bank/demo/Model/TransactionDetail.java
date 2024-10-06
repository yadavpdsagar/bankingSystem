package com.bank.demo.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;


@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class TransactionDetail {

@Id
@GeneratedValue
    private  Integer TransactionId;
 private  String name;

    @Enumerated(EnumType.STRING)
private TransactionType transactionType;

	private Long TransactionAmount;

    @ManyToOne
    @JoinColumn(name = "accountNumber")
	//@JsonBackReference
    private AccountDetail accountDetail;


}
