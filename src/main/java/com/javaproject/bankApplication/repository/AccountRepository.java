package com.javaproject.bankApplication.repository;

import com.javaproject.bankApplication.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long>{
}
