package com.emazon.transaction.domain.api.usecase;

import com.emazon.transaction.domain.api.ITransactionServicePort;
import com.emazon.transaction.domain.model.Transaction;
import com.emazon.transaction.domain.spi.ITransactionPort;

public class TransactionUseCase implements ITransactionServicePort {

    private ITransactionPort transactionPort;

    public TransactionUseCase(ITransactionPort transactionPort) {
        this.transactionPort = transactionPort;
    }

    @Override
    public void supplyUpdate(Transaction transaction) {
        transactionPort.supplyUpdate(transaction);
    }
}
