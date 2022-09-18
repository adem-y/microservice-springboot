package com.ademyildiz.productionservice.service;

import com.ademyildiz.productionservice.entity.Products;

import java.util.List;

public interface ProductsService {
    List<Products> getAllProducts();
    Products getProductById(Integer product_id);
}
