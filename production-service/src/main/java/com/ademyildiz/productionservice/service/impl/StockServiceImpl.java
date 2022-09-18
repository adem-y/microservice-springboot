package com.ademyildiz.productionservice.service.impl;

import com.ademyildiz.productionservice.entity.Stocks;
import com.ademyildiz.productionservice.repository.StocksRepo;
import com.ademyildiz.productionservice.service.StocksService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class StockServiceImpl implements StocksService {

    @Autowired
    private StocksRepo stocksRepo;

    public StockServiceImpl(StocksRepo stocksRepo) {
        this.stocksRepo = stocksRepo;
    }

    @Override
    public List<Stocks> getStocks() {
        log.info("[PRODUCTION-SERVICE] Inside getStocks method of service layer.");
        return stocksRepo.findAll();
    }
}
