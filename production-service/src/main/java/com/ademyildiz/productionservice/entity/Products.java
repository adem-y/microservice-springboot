package com.ademyildiz.productionservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "products")
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer product_id;

    @Column(name = "product_name")
    private String product_name;

    @Column(name = "brand_id")
    private Integer brand_id;

    @Column(name = "category_id")
    private Integer category_id;

    @Column(name = "model_year")
    private Integer model_year;

    @Column(name = "list_price")
    private Float list_price;
}
