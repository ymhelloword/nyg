package com.nyg.ssm.service;

import com.nyg.ssm.entity.OrderCart;

import java.util.List;

/**
 * @Author zjl
 * @Date 2019/8/7 17:19
 */
public interface OrderCartService {
    public int addItem(OrderCart orderCart);
    public int deleteItem(OrderCart orderCart);
    public List <OrderCart> findOrderByUserId(int id);
    public int updataItem(OrderCart orderCart);
    public int deleteItems(List<Integer> itemId );
}
