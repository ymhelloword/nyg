package com.nyg.ssm.dao;

import com.nyg.ssm.entity.OrderCart;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderCartDao {
    int addItem(OrderCart orderCart);

    int deleteItem(OrderCart orderCart);

    List <OrderCart> findOrderByUserId(int customerId);

    int updataItem(OrderCart orderCart);

    int deleteItems(List <Integer> itemId);

    int whetherPersenceProducte(@Param("customerId") int customerId, @Param("productId") int productId);
}
