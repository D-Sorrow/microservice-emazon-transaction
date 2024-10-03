package com.emazon.transaction.DataProvider;

import com.emazon.transaction.domain.model.Transaction;

import java.time.LocalDate;

public class DataProviderTransaction {
    public static Transaction transactionMock(){
        return new Transaction(
                1L,
                101L,
                5L,
                5,
                LocalDate.of(2024, 10, 1),
                LocalDate.of(2024, 10, 3),
                "Transaction completed successfully."
        );
    }
}
