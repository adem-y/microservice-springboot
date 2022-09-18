package com.ademyildiz.salesservice.service;

import com.ademyildiz.salesservice.entity.Orders;
import com.ademyildiz.salesservice.repository.OrdersRepo;
import com.ademyildiz.salesservice.service.impl.OrdersServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class OrdersServiceImplTest {

    private OrdersServiceImpl ordersService;
    private OrdersRepo ordersRepo;

    @Before
    public void setUp() throws Exception {
        ordersRepo = Mockito.mock(OrdersRepo.class);
        ordersService = new OrdersServiceImpl(ordersRepo);
    }

    @Test
    public void whenGetAllOrdersWithValidRequest_ShouldReturnNotNull(){
        List<Orders> allOrders = ordersService.getOrders();
        Assert.assertNotNull(allOrders);
    }

}
