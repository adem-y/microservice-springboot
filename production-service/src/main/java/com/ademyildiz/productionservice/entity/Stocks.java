package com.ademyildiz.productionservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "stocks")
public class Stocks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer store_id;

    @Column(name = "product_id")
    private Integer product_id;

    @Column(name = "quantity")
    private Integer quantity;
}
