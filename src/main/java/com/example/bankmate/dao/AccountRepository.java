package com.example.bankmate.dao;

import com.example.bankmate.entity.Account;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AccountRepository extends CrudRepository<Account, Long> {
    public List<Account> findAll();
}
