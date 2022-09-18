package com.ademyildiz.salesservice.repository;

import com.ademyildiz.salesservice.entity.OrderItems;
import org.hibernate.criterion.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemsRepo extends JpaRepository<OrderItems, Integer> {

    @Query("SELECT t FROM OrderItems t WHERE t.order_id=?1 AND t.item_id=?2")
    OrderItems getOrderItemByOrderIdAndItemId(Integer order_id, Integer item_id);
}
