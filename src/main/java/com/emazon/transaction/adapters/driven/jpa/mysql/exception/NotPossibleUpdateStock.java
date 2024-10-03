package com.emazon.transaction.adapters.driven.jpa.mysql.exception;

public class NotPossibleUpdateStock extends RuntimeException {
    public NotPossibleUpdateStock(String message) {
        super(message);
    }
}
