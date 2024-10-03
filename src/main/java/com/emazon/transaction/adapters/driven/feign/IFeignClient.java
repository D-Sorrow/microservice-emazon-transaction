package com.emazon.transaction.adapters.driven.feign;

import com.emazon.transaction.configuration.feign.FeignClientConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "stock-api", url = "http://localhost:8080/article",configuration = FeignClientConfig.class)
public interface IFeignClient {

    @PutMapping("/{articleId}/{quantity}")
    Void updateStockArticle(@PathVariable Long articleId, @RequestParam Integer quantity);
}
