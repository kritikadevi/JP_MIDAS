package com.jpmc.midascore.controller;

import com.jpmc.midascore.model.Balance;
import com.jpmc.midascore.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping
    public ResponseEntity<Balance> createTransaction(@RequestBody Balance balance) {
        Balance createdBalance = transactionService.processTransaction(balance);
        return ResponseEntity.ok(createdBalance);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Balance> getTransaction(@PathVariable Long id) {
        Balance balance = transactionService.getTransactionById(id);
        return ResponseEntity.ok(balance);
    }

    @GetMapping
    public ResponseEntity<List<Balance>> getAllTransactions() {
        List<Balance> balances = transactionService.getAllTransactions();
        return ResponseEntity.ok(balances);
    }
}