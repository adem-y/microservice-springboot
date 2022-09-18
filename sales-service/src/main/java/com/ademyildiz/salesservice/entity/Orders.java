package com.ademyildiz.salesservice.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "orders")
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer order_id;

    @Column(name = "customer_id")
    private Integer customer_id;
    @Column(name = "order_status")
    private Integer order_status;
    @Column(name = "order_date")
    private String order_date;
    @Column(name = "required_date")
    private String required_date;
    @Column(name = "shipped_date")
    private String shipped_date;
    @Column(name = "store_id")
    private Integer store_id;
    @Column(name = "staff_id")
    private Integer staff_id;
}
