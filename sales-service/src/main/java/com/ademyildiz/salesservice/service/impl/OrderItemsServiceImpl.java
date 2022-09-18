package com.ademyildiz.salesservice.service.impl;

import com.ademyildiz.salesservice.VO.Products;
import com.ademyildiz.salesservice.VO.ResponseTemplateVO;
import com.ademyildiz.salesservice.entity.OrderItems;
import com.ademyildiz.salesservice.repository.OrderItemsRepo;
import com.ademyildiz.salesservice.service.OrderItemsService;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.weaver.ast.Or;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@Slf4j
public class OrderItemsServiceImpl implements OrderItemsService {

    @Autowired
    private OrderItemsRepo orderItemsRepo;

    @Autowired
    private RestTemplate restTemplate;

    public OrderItemsServiceImpl(OrderItemsRepo orderItemsRepo, RestTemplate restTemplate) {
        this.orderItemsRepo = orderItemsRepo;
        this.restTemplate = restTemplate;
    }

    @Override
    public List<OrderItems> getAllOrderItems() {
        log.info("[SALES-SERVICE] Inside getAllOrderItems method of service layer.");
        return orderItemsRepo.findAll();
    }

    @Override
    public ResponseTemplateVO getOrderItemsWithProductInfo(Integer orderId, Integer itemId) {
        log.info("[SALES-SERVICE] Inside getOrderItemsWithProductInfo method of service layer.");
        ResponseTemplateVO vo = new ResponseTemplateVO();

        OrderItems orderItems = orderItemsRepo.getOrderItemByOrderIdAndItemId(orderId, itemId);
        Products products = restTemplate.getForObject("http://PRODUCTION-SERVICE/production/products/" + orderItems.getProduct_id(), Products.class);

        vo.setOrderItems(orderItems);
        vo.setProducts(products);
        return vo;
    }
}
