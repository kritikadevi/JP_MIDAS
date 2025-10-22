package com.jpmc.midascore.repository;

import com.jpmc.midascore.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    // Additional query methods can be defined here if needed
}