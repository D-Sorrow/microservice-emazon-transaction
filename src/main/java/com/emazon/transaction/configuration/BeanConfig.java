package com.emazon.transaction.configuration;

import com.emazon.transaction.adapters.driven.feign.IFeignClient;
import com.emazon.transaction.adapters.driven.jpa.mysql.adapter.TransactionAdapter;
import com.emazon.transaction.adapters.driven.jpa.mysql.mapper.ITransactionEntityMapper;
import com.emazon.transaction.adapters.driven.jpa.mysql.repository.ITransactionRepository;
import com.emazon.transaction.configuration.feign.FeignClientConfig;
import com.emazon.transaction.domain.api.ITransactionServicePort;
import com.emazon.transaction.domain.api.usecase.TransactionUseCase;
import com.emazon.transaction.domain.spi.ITransactionPort;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfig {

    private final ITransactionEntityMapper transactionEntityMapper;
    private final ITransactionRepository transactionRepository;
    private final IFeignClient feignClient;

    @Bean
    public ITransactionPort transactionPort() {
        return new TransactionAdapter(transactionEntityMapper,transactionRepository,feignClient);
    }

    @Bean
    public ITransactionServicePort transactionServicePort() {
        return new TransactionUseCase(transactionPort());
    }
}
