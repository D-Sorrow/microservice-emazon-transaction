package com.emazon.transaction.domain.api.usecase;

import com.emazon.transaction.DataProvider.DataProviderTransaction;
import com.emazon.transaction.adapters.driven.jpa.mysql.adapter.TransactionAdapter;
import com.emazon.transaction.domain.model.Transaction;
import com.emazon.transaction.domain.spi.ITransactionPort;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class TransactionUseCaseTest {

    @Mock
    private TransactionAdapter transactionAdapter;

    @InjectMocks
    private TransactionUseCase transactionUseCase;


    @Test
    void supplyUpdate() {

        this.transactionUseCase.supplyUpdate(DataProviderTransaction.transactionMock());

        ArgumentCaptor<Transaction> captor = ArgumentCaptor.forClass(Transaction.class);
        verify(this.transactionAdapter).supplyUpdate(captor.capture());

        assertNotNull(captor.getValue());
        assertEquals(DataProviderTransaction.transactionMock().getTransactionId(), captor.getValue().getTransactionId());
        assertEquals(DataProviderTransaction.transactionMock().getTransactionMessage(), captor.getValue().getTransactionMessage());
        assertEquals(DataProviderTransaction.transactionMock().getTransactionDate(), captor.getValue().getTransactionDate());
        assertEquals(DataProviderTransaction.transactionMock().getQuantity(), captor.getValue().getQuantity());
        assertEquals(DataProviderTransaction.transactionMock().getProductId(), captor.getValue().getProductId());
    }
}