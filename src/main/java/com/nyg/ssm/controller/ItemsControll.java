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
public class ItemsControll {
    @Autowired
    private ProductInfoService productInfoService;
    @RequestMapping(value = "/search",method = RequestMethod.GET)
    public String items(String productName, Model model){
        PageUtil page = new PageUtil(40,1);
        List<ProductInfo> list = productInfoService.getProductSimpleInfoByName(productName,page);
        model.addAttribute("items",list);
        int count = list.size();
        int pageNumber = ( int ) Math.ceil(count/40.0);
        model.addAttribute("pageNumber",pageNumber);
        model.addAttribute("count",count);
        return "/items";
    }
}
