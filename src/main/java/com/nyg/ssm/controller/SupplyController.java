package com.nyg.ssm.controller;

import com.alibaba.fastjson.JSON;
import com.nyg.ssm.entity.page.Page;
import com.nyg.ssm.service.ProductInfoService;
import com.nyg.ssm.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author zjl
 * @Date 2019/7/30 16:50
 */
@Controller
public class SupplyController {
    @Autowired
    private ProductInfoService productInfoService;
    @Autowired
    private RedisService redisService;
    @RequestMapping(value = "/supply/{pageNumber}",produces = "application/json;charset=utf-8")
    public String ItemPage(@PathVariable("pageNumber") Integer pageNumber, Model model){
        int pageSize=40;
        Page page = productInfoService.getPageByPageId(pageNumber,pageSize,null);
        int count = productInfoService.getCount( );
        pageNumber = ( int ) Math.ceil(count/40.0);
        model.addAttribute("pageNumber",pageNumber);
        model.addAttribute("count",count);
        model.addAttribute("products",page.getData());
        return "supply";
    }
}
