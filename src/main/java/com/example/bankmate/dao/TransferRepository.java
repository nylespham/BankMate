package com.example.bankmate.dao;

import com.example.bankmate.entity.Transfer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TransferRepository extends CrudRepository<Transfer, Long> {
    public List<Transfer> findAll();
}
