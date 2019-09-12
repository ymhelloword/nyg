package com.nyg.ssm.controller;

import com.nyg.ssm.entity.OrderCart;
import com.nyg.ssm.entity.ProductInfo;
import com.nyg.ssm.service.OrderCartService;
import com.nyg.ssm.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author zjl
 * @Date 2019/8/12 8:17
 */
@Controller
public class OrderCartController {
    @Autowired
    private OrderCartService orderCartService;
    @Autowired
    private ProductInfoService productInfoService;
    @RequestMapping(value = "/orderCart",method = RequestMethod.GET)
    public String orderCart(HttpServletRequest request, Model model){
        Integer customerId = ( Integer ) request.getSession().getAttribute("customerId");
        if ( customerId==null ){
            model.addAttribute("orderCart",null);
            model.addAttribute("products",null);
            return "orderCart";
        }
        List<OrderCart> list = orderCartService.findOrderByUserId(customerId);
        Iterator<OrderCart> iterator = list.iterator();
        List<ProductInfo> productInfos = new ArrayList <ProductInfo>();
        while ( iterator.hasNext() ){
            OrderCart orderCart = iterator.next();
            productInfos.add(productInfoService.getProductSimpleInfoById(orderCart.getProductId()));
        }
        model.addAttribute("orderCart",list);
        model.addAttribute("products",productInfos);
        return "orderCart";
    }
    @RequestMapping(value = "/orderCart",method = RequestMethod.DELETE)
    @ResponseBody
    public int deleteProduct(HttpServletRequest request,OrderCart orderCart){
        int customerId = ( int ) request.getSession().getAttribute("customerId");
        orderCart.setCustomerId(customerId);
        return orderCartService.deleteItem(orderCart);
    }
    public int updateOrderCat(HttpServletRequest request,OrderCart orderCart){
        int customerId = ( int ) request.getSession().getAttribute("customerId");
        orderCart.setCustomerId(customerId);
        return orderCartService.updataItem(orderCart);
    }

}
