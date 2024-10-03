package com.emazon.transaction.adapters.driven.feign;

import com.emazon.transaction.configuration.feign.FeignClientConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import static com.emazon.transaction.adapters.driven.jpa.mysql.constants.ConstantsAdapterJpa.NAME_TO_FEIGN_STOCK;
import static com.emazon.transaction.adapters.driven.jpa.mysql.constants.ConstantsAdapterJpa.URL_API_STOCK_FEIGN;

@FeignClient(name = NAME_TO_FEIGN_STOCK, url = URL_API_STOCK_FEIGN,configuration = FeignClientConfig.class)
public interface IFeignClient {

    @PutMapping("/{articleId}/{quantity}")
    Void updateStockArticle(@PathVariable Long articleId, @RequestParam Integer quantity);
}
