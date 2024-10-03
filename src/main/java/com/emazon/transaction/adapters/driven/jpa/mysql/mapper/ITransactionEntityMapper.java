package com.emazon.transaction.adapters.driven.jpa.mysql.mapper;

import com.emazon.transaction.adapters.driven.jpa.mysql.entity.TransactionEntity;
import com.emazon.transaction.domain.model.Transaction;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ITransactionEntityMapper {

    TransactionEntity toTransactionEntity(Transaction transaction);
}
