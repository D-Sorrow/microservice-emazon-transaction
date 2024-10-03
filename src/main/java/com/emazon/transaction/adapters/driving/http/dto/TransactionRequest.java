package com.emazon.transaction.adapters.driving.http.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;
import java.util.Date;


@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class TransactionRequest {


    @NonNull
    @NotEmpty
    private Long userId;

    @NonNull
    @NotEmpty
    private Long productId;

    @NonNull
    @NotEmpty
    private Integer quantity;

    @NonNull
    @NotEmpty
    private String transactionMessage;

    @NonNull
    @NotEmpty
    private LocalDate newTransactionDate;
}
