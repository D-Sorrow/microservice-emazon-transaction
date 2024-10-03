package com.emazon.transaction.domain.model;

import java.time.LocalDate;
import java.util.Date;

public class Transaction {

    private Long transactionId;
    private Long userId;
    private Long productId;
    private Integer quantity;
    private LocalDate transactionDate;
    private LocalDate newTransactionDate;
    private String transactionMessage;

    public Transaction(Long transactionId, Long userId, Long productId, Integer quantity,
                       LocalDate transactionDate, LocalDate newTransactionDate, String transactionMessage) {
        this.transactionId = transactionId;
        this.userId = userId;
        this.productId = productId;
        this.quantity = quantity;
        this.transactionDate = transactionDate;
        this.newTransactionDate = newTransactionDate;
        this.transactionMessage = transactionMessage;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    public LocalDate getNewTransactionDate() {
        return newTransactionDate;
    }

    public void setNewTransactionDate(LocalDate newTransactionDate) {
        this.newTransactionDate = newTransactionDate;
    }

    public String getTransactionMessage() {
        return transactionMessage;
    }

    public void setTransactionMessage(String transactionMessage) {
        this.transactionMessage = transactionMessage;
    }
}
