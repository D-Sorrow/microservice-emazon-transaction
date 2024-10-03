package com.emazon.transaction.adapters.driven.jpa.mysql.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "Transaction")
@Data
public class TransactionEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long transactionId;

    @Column(nullable = false)
    private Long userId;

    @Column(nullable = false)
    private Long productId;

    @Column(nullable = false)
    private Integer quantity;

    @Column(nullable = false)
    private Date transactionDate;

    @Column(nullable = false)
    private Date newTransactionDate;

    @Column(nullable = false)
    private String transactionMessage;
}
