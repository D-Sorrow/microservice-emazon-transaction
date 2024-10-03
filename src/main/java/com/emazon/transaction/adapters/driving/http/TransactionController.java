package com.emazon.transaction.adapters.driving.http;

import com.emazon.transaction.adapters.driving.http.dto.TransactionRequest;
import com.emazon.transaction.adapters.driving.http.mapper.ITransactionRequestMapper;
import com.emazon.transaction.configuration.feign.FeignClientConfig;
import com.emazon.transaction.domain.api.ITransactionServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transaction")
@RequiredArgsConstructor
public class TransactionController {

    private final ITransactionServicePort transactionService;
    private final ITransactionRequestMapper requestMapper;

    @PostMapping("/supplyUpdate")
    public ResponseEntity<Void> supplyUpdate(@RequestBody TransactionRequest requestBody) {
        transactionService.supplyUpdate(requestMapper.toTransaction(requestBody));
        return ResponseEntity.ok().build();
    }
}
