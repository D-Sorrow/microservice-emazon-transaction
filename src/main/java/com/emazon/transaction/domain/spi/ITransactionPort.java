package com.emazon.transaction.domain.spi;

import com.emazon.transaction.domain.model.Transaction;

public interface ITransactionPort {

    void supplyUpdate(Transaction transaction);
}
