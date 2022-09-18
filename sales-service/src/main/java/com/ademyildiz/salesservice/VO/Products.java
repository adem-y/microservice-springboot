package com.ademyildiz.salesservice.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Products {

    private Integer product_id;
    private String product_name;
    private Integer brand_id;
    private Integer category_id;
    private Integer model_year;
    private Float list_price;
}
