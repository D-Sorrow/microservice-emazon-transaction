package com.emazon.transaction.configuration.exceptionhandler;

import com.emazon.transaction.adapters.driven.jpa.mysql.exception.NotPossibleUpdateStock;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

import static com.emazon.transaction.adapters.driven.jpa.mysql.constants.ConstantsAdapterJpa.MESSAGE_NOT_POSSIBLE_UPDATE_STOCK;


@ControllerAdvice
@RequiredArgsConstructor
public class ControllerAdvisor {

    @ExceptionHandler(NotPossibleUpdateStock.class)
    public ResponseEntity<ExceptionResponse> handleNotPossibleUpdateStock(NotPossibleUpdateStock exception) {
        return ResponseEntity.badRequest().body(new ExceptionResponse(
                String.format(MESSAGE_NOT_POSSIBLE_UPDATE_STOCK, exception.getMessage()),
                HttpStatus.BAD_REQUEST.toString(), LocalDateTime.now()
        ));
    }

}
