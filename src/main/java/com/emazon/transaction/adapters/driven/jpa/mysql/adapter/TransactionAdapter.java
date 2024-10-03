package com.emazon.transaction.adapters.driven.jpa.mysql.adapter;

import com.emazon.transaction.adapters.driven.feign.IFeignClient;
import com.emazon.transaction.adapters.driven.jpa.mysql.exception.NotPossibleUpdateStock;
import com.emazon.transaction.adapters.driven.jpa.mysql.mapper.ITransactionEntityMapper;
import com.emazon.transaction.adapters.driven.jpa.mysql.repository.ITransactionRepository;
import com.emazon.transaction.domain.model.Transaction;
import com.emazon.transaction.domain.spi.ITransactionPort;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TransactionAdapter implements ITransactionPort {

    private final ITransactionEntityMapper mapper;
    private final ITransactionRepository repository;
    private final IFeignClient feignClient;


    @Override
    @Transactional
    public void supplyUpdate(Transaction transaction) {

        repository.save(mapper.toTransactionEntity(transaction));

        try{
            feignClient.updateStockArticle(transaction.getProductId(), transaction.getQuantity());
        }catch (Exception ex){
            throw new NotPossibleUpdateStock(ex.getMessage());
        }

    }
}
