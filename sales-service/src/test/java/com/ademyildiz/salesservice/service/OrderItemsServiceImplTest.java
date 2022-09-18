package com.ademyildiz.salesservice.service;

import com.ademyildiz.salesservice.VO.Products;
import com.ademyildiz.salesservice.VO.ResponseTemplateVO;
import com.ademyildiz.salesservice.entity.OrderItems;
import com.ademyildiz.salesservice.repository.OrderItemsRepo;
import com.ademyildiz.salesservice.service.impl.OrderItemsServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@SpringBootTest
public class OrderItemsServiceImplTest {

    private OrderItemsServiceImpl orderItemsService;
    private OrderItemsRepo orderItemsRepo;
    private RestTemplate restTemplate;

    @Before
    public void setUp() throws Exception {
        orderItemsRepo = Mockito.mock(OrderItemsRepo.class);
        restTemplate = Mockito.mock(RestTemplate.class);
        orderItemsService = new OrderItemsServiceImpl(orderItemsRepo, restTemplate);
    }

    @Test
    public void whenGetAllOrderItemsWithValidRequest_ShouldReturnNotNull(){
        List<OrderItems> allOrderItems = orderItemsService.getAllOrderItems();
        Assert.assertNotNull(allOrderItems);
    }

    @Test
    public void whenGetOrderItemsWithProductInfoWithValidRequest_ShouldReturnNotNull(){
        ResponseTemplateVO vo = Mockito.mock(ResponseTemplateVO.class);

        Integer orderId = Mockito.anyInt();
        Integer itemId = Mockito.anyInt();

        Mockito.when(orderItemsRepo.getOrderItemByOrderIdAndItemId(orderId, itemId)).thenReturn(new OrderItems());
        Mockito.when(restTemplate.getForObject(Mockito.any(), Mockito.any())).thenReturn(new Products());

        Mockito.when(orderItemsService.getOrderItemsWithProductInfo(orderId, itemId)).thenReturn(vo);
        Assert.assertNotNull(vo);
    }

}
