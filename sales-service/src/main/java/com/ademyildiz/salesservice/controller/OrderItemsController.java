package com.ademyildiz.salesservice.controller;

import com.ademyildiz.salesservice.VO.ResponseTemplateVO;
import com.ademyildiz.salesservice.entity.OrderItems;
import com.ademyildiz.salesservice.service.OrderItemsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sales/orderItems")
@Slf4j
public class OrderItemsController {

    @Autowired
    OrderItemsService orderItemsService;

    @GetMapping("/")
    public List<OrderItems> getAllOrderItems(){
        log.info("[SALES-SERVICE] Inside getAllOrderItems method of controller layer.");
        return orderItemsService.getAllOrderItems();
    }

    //@GetMapping("/{orderId}/{itemId}")
    @GetMapping(value = "/{orderId}/{itemId}")
    public ResponseTemplateVO getOrderItemsWithProductInfo(@PathVariable("orderId") Integer orderId,
                                                           @PathVariable("itemId") Integer itemId){
        log.info("[SALES-SERVICE] Inside getOrderItemsWithProductInfo method of controller layer.");
        return orderItemsService.getOrderItemsWithProductInfo(orderId, itemId);
    }
}
