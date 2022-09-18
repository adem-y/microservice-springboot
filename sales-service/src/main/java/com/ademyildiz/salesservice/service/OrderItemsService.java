package com.ademyildiz.salesservice.service;

import com.ademyildiz.salesservice.VO.ResponseTemplateVO;
import com.ademyildiz.salesservice.entity.OrderItems;

import java.util.List;

public interface OrderItemsService {

    List<OrderItems> getAllOrderItems();

    ResponseTemplateVO getOrderItemsWithProductInfo(Integer orderId, Integer itemId);
}
