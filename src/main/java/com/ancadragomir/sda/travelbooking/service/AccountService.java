package com.ancadragomir.sda.travelbooking.service;

import com.ancadragomir.sda.travelbooking.model.Account;
import com.ancadragomir.sda.travelbooking.model.Role;
import com.ancadragomir.sda.travelbooking.repository.AccountRepository;
import com.ancadragomir.sda.travelbooking.service.dto.AccountDTO;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AccountService implements UserDetailsService {
    private final AccountRepository accountRepository;
    private final BCryptPasswordEncoder passwordEncode;

    public AccountService(AccountRepository accountRepository, BCryptPasswordEncoder passwordEncode) {
        this.accountRepository = accountRepository;
        this.passwordEncode = passwordEncode;
    }


    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Account account = accountRepository.findByUsername(userName);
        if (account == null) {
            throw new UsernameNotFoundException("invalid username of password");
        }
        return new User(account.getUsername(), account.getPassword(), new ArrayList<>());
    }

    public void createAccount(AccountDTO accountDTO) {

        Account account = new Account();
        account.setUsername(accountDTO.getUsername());
        account.setEmail(accountDTO.getEmail());
        account.setPassword(passwordEncode.encode(accountDTO.getPassword()));
        account.setRole(Role.CUSTOMER);

        accountRepository.save(account);
    }


    public Boolean accountExist(String userName) {
        Account accountExisting = accountRepository.findByUsername(userName);
        return accountExisting != null;
    }
}
