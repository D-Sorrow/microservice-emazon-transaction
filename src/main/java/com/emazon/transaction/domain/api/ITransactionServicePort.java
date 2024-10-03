package com.emazon.transaction.domain.api;

import com.emazon.transaction.domain.model.Transaction;

public interface ITransactionServicePort {

    void supplyUpdate(Transaction transaction);
}
