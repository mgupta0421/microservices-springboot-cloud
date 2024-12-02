package com.example.accounts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.accounts.entity.Accounts;

@Repository
public interface AccountRepository extends JpaRepository<Accounts, Long> {
    
}
