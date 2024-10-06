package com.bank.demo.Model;

import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Component
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

@JsonIgnoreProperties({"transactionDetails"})
public class AccountDetail  {
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
  	private String Name;
    private Long balance;

    @ManyToOne
    @JoinColumn(name = "AccTypId")
    private AccountType accountType;

    @OneToMany(mappedBy = "accountDetail" ,cascade = CascadeType.ALL)
	@JsonManagedReference
    private List<TransactionDetail> transactionDetails = new ArrayList<>();


}
