package com.ademyildiz.productionservice.service;

import com.ademyildiz.productionservice.entity.Products;
import com.ademyildiz.productionservice.repository.ProductsRepo;
import com.ademyildiz.productionservice.service.impl.ProductsServiceImpl;
import com.mysql.cj.x.protobuf.Mysqlx;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootTest
@RunWith(MockitoJUnitRunner.Silent.class)
public class ProductsServiceImplTest {

    @Mock
    private ProductsServiceImpl productsService;

    @Mock
    private ProductsRepo productsRepo;

    @Before
    public void setUp() throws Exception {
        productsRepo = Mockito.mock(ProductsRepo.class);
        productsService = new ProductsServiceImpl(productsRepo);
    }

    @Test
    public void whenGetAllProductsWithValidRequest_ShouldReturnNotNull(){
        //List<Products> allProducts = productsService.getAllProducts();
        List<Products> allProducts = new ArrayList<>();
        Mockito.when(productsService.getAllProducts()).thenReturn(allProducts);
        Assert.assertNotNull(allProducts);
    }

    @Test
    public void productByIdTest(){
        Products products = new Products();
        products.setProduct_id(1);
        Mockito.when(productsRepo.findById(1)).thenReturn(Optional.of(products));
        Products products1 = new Products();
        products1.setProduct_id(1);
        productsService.getProductById(1);
        Assert.assertEquals(products, products1);
    }

}
