package com.ademyildiz.productionservice.controller;

import com.ademyildiz.productionservice.entity.Stocks;
import com.ademyildiz.productionservice.service.StocksService;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/production/stocks")
@Slf4j
public class StocksController {

    @Autowired
    private StocksService stocksService;

    @GetMapping("/")
    public List<Stocks> getStocks(){
        log.info("[PRODUCTION-SERVICE] Inside getStocks method of controller layer.");
        return stocksService.getStocks();
    }
}
