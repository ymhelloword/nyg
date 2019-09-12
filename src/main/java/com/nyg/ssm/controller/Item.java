package com.nyg.ssm.controller;

import com.nyg.ssm.entity.ProductInfo;
import com.nyg.ssm.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author zjl
 * @Date 2019/6/9 16:35
 */
@Controller
@RequestMapping("/item")
public class Item {
    @Autowired
    private ProductInfoService productInfoService;
    @RequestMapping(value = "item",method = RequestMethod.GET)
    public String item(int id, Model model){
        System.out.println(id) ;
        ProductInfo productInfo = productInfoService.getProductSimpleInfoById(id);
        System.out.println(productInfo+"...") ;
        model.addAttribute("productInfo",productInfo);
        return "gongying";
    }
}
