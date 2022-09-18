package com.ademyildiz.productionservice.service;

import com.ademyildiz.productionservice.entity.Stocks;
import com.ademyildiz.productionservice.repository.StocksRepo;
import com.ademyildiz.productionservice.service.impl.StockServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class StockServiceImplTest {

    @Mock
    private StockServiceImpl stockService;

    @Mock
    private StocksRepo stocksRepo;

    @Before
    public void setUp() throws Exception{
        stocksRepo = Mockito.mock(StocksRepo.class);
        stockService = new StockServiceImpl(stocksRepo);
    }

    @Test
    public void whenGetAllStocksWithValidRequest_ShouldReturnNotNull(){
        List<Stocks> allStocks = stockService.getStocks();
        Assert.assertNotNull(allStocks);
    }
}
