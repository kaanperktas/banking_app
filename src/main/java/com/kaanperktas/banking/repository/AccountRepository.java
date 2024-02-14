package com.kaanperktas.banking.repository;

import com.kaanperktas.banking.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
