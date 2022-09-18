package com.ademyildiz.salesservice.controller;

import com.ademyildiz.salesservice.entity.Orders;
import com.ademyildiz.salesservice.service.OrdersService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sales/orders")
@Slf4j
public class OrdersController {

    @Autowired
    private OrdersService ordersService;

    @GetMapping("/")
    public List<Orders> getAllOrders(){
        log.info("[SALES-SERVICE] Inside getStocks method of controller layer.");
        return ordersService.getOrders();
    }
}
