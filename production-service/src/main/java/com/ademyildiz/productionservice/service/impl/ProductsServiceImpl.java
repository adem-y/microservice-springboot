package com.ademyildiz.productionservice.service.impl;

import com.ademyildiz.productionservice.entity.Products;
import com.ademyildiz.productionservice.repository.ProductsRepo;
import com.ademyildiz.productionservice.service.ProductsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ProductsServiceImpl implements ProductsService {

    @Autowired
    ProductsRepo productsRepo;

    public ProductsServiceImpl(ProductsRepo productsRepo) {
        this.productsRepo = productsRepo;
    }

    @Override
    public List<Products> getAllProducts() {
        log.info("[PRODUCTION-SERVICE] Inside getAllProducts method of service layer.");
        return productsRepo.findAll();
    }

    @Override
    public Products getProductById(Integer product_id) {
        log.info("[PRODUCTION-SERVICE] Inside getProductById method of service layer.");
        return productsRepo.findById(product_id).orElseThrow();
    }
}
