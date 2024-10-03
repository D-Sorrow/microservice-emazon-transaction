package com.emazon.transaction.adapters.driving.http.mapper;

import com.emazon.transaction.adapters.driving.http.dto.TransactionRequest;
import com.emazon.transaction.domain.model.Transaction;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ITransactionRequestMapper {

    @Mapping(target = "transactionDate", expression = "java(java.time.LocalDate.now())")
    Transaction toTransaction(TransactionRequest transactionRequest);
    
}
