package com.ademyildiz.salesservice.VO;

import com.ademyildiz.salesservice.entity.OrderItems;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {

    private OrderItems orderItems;
    private Products products;

}
