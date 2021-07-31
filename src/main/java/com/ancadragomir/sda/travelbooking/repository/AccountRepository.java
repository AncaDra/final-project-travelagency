package com.ancadragomir.sda.travelbooking.repository;

import com.ancadragomir.sda.travelbooking.model.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account,Long> {

    Account findByUsername(String username);
}
