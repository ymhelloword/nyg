package com.nyg.ssm.controller;

import com.nyg.ssm.entity.ProductInfo;
import com.nyg.ssm.service.ProductInfoService;
import com.nyg.ssm.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;
/**
 * @Author zjl
 * @Date 2019/6/19 19:36
 */
@Controller
@RequestMapping("/items")
public class ItemsControll {
    @Autowired
    private ProductInfoService productInfoService;
    @RequestMapping(value = "/{page}",method = RequestMethod.GET)
    public String items(String productName, @PathVariable("page") int start, Model model){
        PageUtil page = new PageUtil(10,start);
        List<ProductInfo> list = productInfoService.getProductSimpleInfoByName(productName,page);
        model.addAttribute("items",list);
        return "/items";
    }
}
