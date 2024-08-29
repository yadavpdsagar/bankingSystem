package com.bank.demo.Repository;

import com.bank.demo.Model.Ledger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LedgerRepo extends JpaRepository<Ledger,Integer > {

}
