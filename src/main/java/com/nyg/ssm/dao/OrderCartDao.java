package com.nyg.ssm.dao;
import com.nyg.ssm.entity.OrderCart;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderCartDao {
    public int addItem(OrderCart orderCart);
    public int deleteItem(OrderCart orderCart);
    public List<OrderCart> findOrderByUserId(int customerId);
    public int updataItem(OrderCart orderCart);
    public int deleteItems(List<Integer> itemId );
    public int whetherPersenceProducte(@Param("customerId") int customerId,@Param("productId") int productId);
}
