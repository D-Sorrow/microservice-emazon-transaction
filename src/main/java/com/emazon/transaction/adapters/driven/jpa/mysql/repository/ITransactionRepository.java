package com.emazon.transaction.adapters.driven.jpa.mysql.repository;

import com.emazon.transaction.adapters.driven.jpa.mysql.entity.TransactionEntity;
import com.emazon.transaction.domain.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITransactionRepository extends JpaRepository<TransactionEntity, Long> {
    public TransactionEntity findByTransactionId(Long transactionId);
}
