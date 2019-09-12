package com.nyg.ssm.service.impl;

import com.nyg.ssm.dao.OrderCartDao;
import com.nyg.ssm.entity.OrderCart;
import com.nyg.ssm.service.OrderCartService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author zjl
 * @Date 2019/8/7 17:20
 */
@Service
public class OrderCartServiceImpl implements OrderCartService {
    @Resource
    private OrderCartDao orderCartDao;
    /**
     *
     *
     *
     * @return 返回2表示以存在在购物车里
     * @dateTime 2019/8/11 16:07
     */
    @Override
    public int addItem(OrderCart orderCart) {
        int a = orderCartDao.whetherPersenceProducte(orderCart.getCustomerId(),orderCart.getProductId());
        if ( a==0){
            return orderCartDao.addItem(orderCart);
        }
        return 2;
    }
    /**
     *
     *删除购物车中的商品
     * @param
     * @return 1:删除成功，0：删除失败
     * @dateTime 2019/8/29 19:12
     */
    @Override
    public int deleteItem(OrderCart orderCart) {
         int a = orderCartDao.deleteItem(orderCart);
         return a==1?1:0;
    }

    @Override
    public List <OrderCart> findOrderByUserId(int id) {
        return orderCartDao.findOrderByUserId(id);
    }

    @Override
    public int updataItem(OrderCart orderCart) {
        return orderCartDao.updataItem(orderCart);
    }

    @Override
    public int deleteItems(List <Integer> itemId) {
        return 0;
    }
}
