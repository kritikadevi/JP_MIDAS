package com.jpmc.midascore;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TaskOneTests {

    @Autowired
    private TransactionService transactionService;

    @Test
    void testTransactionProcessing() {
        // Add test logic here to verify transaction processing
    }

    @Test
    void testBalanceCalculation() {
        // Add test logic here to verify balance calculation
    }
}