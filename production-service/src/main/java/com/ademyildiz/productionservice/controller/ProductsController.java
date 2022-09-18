package com.ademyildiz.productionservice.controller;


import com.ademyildiz.productionservice.entity.Products;
import com.ademyildiz.productionservice.service.ProductsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/production/products")
@Slf4j
public class ProductsController {

    @Autowired
    ProductsService productsService;

    @GetMapping("/")
    public List<Products> getAllProducts(){
        log.info("[PRODUCTION-SERVICE] Inside getAllProducts method of controller layer.");
        return productsService.getAllProducts();
    }

    @GetMapping("{id}")
    public ResponseEntity<Products> getProductsById(@PathVariable("id") Integer id){
        log.info("[PRODUCTION-SERVICE] Inside getProductsById method of controller layer.");
        return new ResponseEntity<Products>(productsService.getProductById(id), HttpStatus.OK);
    }
}
