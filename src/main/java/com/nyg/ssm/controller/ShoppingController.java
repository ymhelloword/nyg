package com.nyg.ssm.controller;
import cn.hutool.db.sql.Order;
import com.nyg.ssm.entity.OrderCart;
import com.nyg.ssm.service.OrderCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
/**
 * @Author zjl
 * @Date 2019/8/7 15:20
 */
@Controller
public class ShoppingController {
    @Autowired
    private OrderCartService orderCartService;
    @RequestMapping(value = "/joinShopping",method = RequestMethod.POST,produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String joinShopping(HttpServletRequest request, OrderCart orderCart){
        String account = String.valueOf(request.getSession().getAttribute("account"));
        Integer customerId = ( Integer ) request.getSession().getAttribute("customerId");
        orderCart.setAddTime(new Date());
        orderCart.setCustomerId(customerId);
        orderCart.setModifiedTime(new Date());
        if ( !StringUtils.isEmpty(account) ){
            int a = orderCartService.addItem(orderCart);
            //2表示商品已存在在购物车i中，1表示添加成功，0表示发生错误
            return a==2?"2":"1";
        }else {
            return "0";
        }

    }
}
