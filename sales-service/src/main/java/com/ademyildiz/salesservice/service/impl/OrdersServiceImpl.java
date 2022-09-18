package com.ademyildiz.salesservice.service.impl;

import com.ademyildiz.salesservice.entity.Orders;
import com.ademyildiz.salesservice.repository.OrdersRepo;
import com.ademyildiz.salesservice.service.OrdersService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    private OrdersRepo ordersRepo;

    public OrdersServiceImpl(OrdersRepo ordersRepo) {
        this.ordersRepo = ordersRepo;
    }

    @Override
    public List<Orders> getOrders() {
        log.info("[SALES-SERVICE] Inside getOrders method of service layer.");
        return ordersRepo.findAll();
    }
}
