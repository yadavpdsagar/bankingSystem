package com.bank.demo.Repository;

import com.bank.demo.Model.AccountType;
import com.bank.demo.Model.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountTypeRepo extends JpaRepository<AccountType,String > {

}


