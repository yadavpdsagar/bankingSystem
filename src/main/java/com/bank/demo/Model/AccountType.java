package com.bank.demo.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AccountType {
    @Id
    private String AccTypId;

    private  String AccTyp;

@OneToMany(mappedBy = "accountType" , cascade = CascadeType.ALL)
    private List<AccountDetail> accountDetailList = new ArrayList<>();

    @OneToOne(mappedBy = "accountType",cascade = CascadeType.ALL)
    private Ledger ledger;

}
