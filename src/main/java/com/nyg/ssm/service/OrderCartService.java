package com.nyg.ssm.service;

import com.nyg.ssm.entity.OrderCart;

import java.util.List;

/**
 * @Author zjl
 * @Date 2019/8/7 17:19
 */
public interface OrderCartService {
    int addItem(OrderCart orderCart);

    int deleteItem(OrderCart orderCart);

    List <OrderCart> findOrderByUserId(int id);

    int updataItem(OrderCart orderCart);

    int deleteItems(List <Integer> itemId);
}
