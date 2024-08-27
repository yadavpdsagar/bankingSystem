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
public class UserDetail {
    @Id
    private Integer UserId;
    private String Name;
  private  String email;
    private String Password;

    @Enumerated(EnumType.STRING  )
    private EmployeeRole role;

    @OneToOne
    private AccountDetail accountDetail;






    }


