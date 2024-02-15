package com.kaanperktas.banking.service;

import com.kaanperktas.banking.dto.AccountDto;
import com.kaanperktas.banking.repository.AccountRepository;

import java.util.List;


public interface AccountService {

    AccountDto createAccount(AccountDto accountDto);

    AccountDto getAccountById(Long id);

    AccountDto deposit(Long id, double amount);

    AccountDto withdraw(Long id, double amount);

    List<AccountDto> getAllAccounts();

    void deleteAccount(Long id);
}
