package com.emazon.transaction.adapters.driving.http;

import com.emazon.transaction.adapters.driving.http.dto.TransactionRequest;
import com.emazon.transaction.adapters.driving.http.mapper.ITransactionRequestMapper;
import com.emazon.transaction.domain.api.ITransactionServicePort;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.emazon.transaction.adapters.driving.http.constants.ConstantsHttp.*;

@RestController
@RequestMapping("/transaction")
@RequiredArgsConstructor
public class TransactionController {

    private final ITransactionServicePort transactionService;
    private final ITransactionRequestMapper requestMapper;


    @Operation(summary = SUPPLY_UPDATE_SUMMARY,
            description = SUPPLY_UPDATE_DESCRIPTION)
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = RESPONSE_200_DESCRIPTION,
                    content = @Content),
            @ApiResponse(responseCode = "400", description = RESPONSE_400_DESCRIPTION,
                    content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
            @ApiResponse(responseCode = "500", description = RESPONSE_500_DESCRIPTION,
                    content = @Content(schema = @Schema(implementation = ErrorResponse.class)))
    })
    @PostMapping("/supplyUpdate")
    public ResponseEntity<Void> supplyUpdate(@RequestBody TransactionRequest requestBody) {
        transactionService.supplyUpdate(requestMapper.toTransaction(requestBody));
        return ResponseEntity.ok().build();
    }
}
