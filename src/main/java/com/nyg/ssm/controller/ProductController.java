package com.nyg.ssm.controller;

import com.nyg.ssm.dao.product.ProductDao;
import com.nyg.ssm.entity.ProductInfo;
import com.nyg.ssm.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

/**
 * @Author zjl
 * @Date 2019/8/16 15:11
 */
@Controller
public class ProductController {
    @Autowired
    private ProductInfoService productInfoService;
    @RequestMapping(value = "/addProduct",method = RequestMethod.POST)
    @ResponseBody
    public String addProduct(ProductInfo productInfo,@RequestParam("file") CommonsMultipartFile[] multipartFile){
        int a= productInfoService.addProduct(productInfo,multipartFile);
        if ( a==0 ){
            return Integer.toString(a);
        }
        return "1";
    }
}
