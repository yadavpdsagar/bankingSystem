package com.bank.demo.Repository;

import com.bank.demo.Model.AccountDetail;
import com.bank.demo.Model.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AccountDetialsRepo extends JpaRepository<AccountDetail,String> {




}
