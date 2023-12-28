package com.example.bankmate.dao;

import com.example.bankmate.entity.Entry;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EntryRepository extends CrudRepository<Entry, Long> {
    public List<Entry> findAll();
}
