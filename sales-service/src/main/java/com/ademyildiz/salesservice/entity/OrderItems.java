package com.ademyildiz.salesservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "order_items")
public class OrderItems {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer order_id;

    @Column(name = "item_id")
    private Integer item_id;

    @Column(name = "product_id")
    private Integer product_id;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "list_price")
    private Float list_price;

    @Column(name = "discount")
    private Float discount;

}
