package com.nyg.ssm.controller;

import com.alibaba.fastjson.JSON;
import com.nyg.ssm.entity.ProductInfo;
import com.nyg.ssm.entity.page.Page;
import com.nyg.ssm.entity.productenum.Fruit;
import com.nyg.ssm.entity.productenum.Vegetable;
import com.nyg.ssm.service.ProductInfoService;
import com.nyg.ssm.service.RedisService;
import com.nyg.ssm.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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
    public String itemPage(@PathVariable("pageNumber") Integer pageNumber, Model model){
        int pageSize=40;
        Page page = productInfoService.getPageByPageId(pageNumber,pageSize,null);
        int count = productInfoService.getCount( );
        pageNumber = ( int ) Math.ceil(count/40.0);
        model.addAttribute("pageNumber",pageNumber);
        model.addAttribute("sortnav","all");
        model.addAttribute("count",count);
        model.addAttribute("products",page.getData());
        return "supply";
    }
    @RequestMapping(value = "/supply",produces = "application/json;charset=utf-8")
    public String itemPage(Model model){
        int pageSize=40;
        Page page = productInfoService.getPageByPageId(1,pageSize,null);
        int count = productInfoService.getCount( );
        int pageNumber = ( int ) Math.ceil(count/40.0);
        model.addAttribute("pageNumber",pageNumber);
        model.addAttribute("count",count);
        model.addAttribute("sortnav","all");
        model.addAttribute("products",page.getData());
        return "supply";
    }
    /*水果页面*/
    @RequestMapping("/supply/fruit")
    public String supplyFruit(Model model){
        List <ProductInfo> productInfos = productInfoService.getProductInfos(1, 2, 0, new PageUtil(40, 1));
        int count = productInfoService.sortCount(1, 2, 0);
        int pageNumber = ( int ) Math.ceil(count/40.0);
        model.addAttribute("pageNumber",pageNumber);
        model.addAttribute("count",count);
        model.addAttribute("sortnav","fruit");
        model.addAttribute("products",productInfos);
        return "supply";
    }
    /*蔬菜页面*/
    @RequestMapping("/supply/vegetables")
    public String supplyVegetables(Model model){
        List <ProductInfo> productInfos = productInfoService.getProductInfos(1, 1, 0, new PageUtil(40, 1));
        int count = productInfoService.sortCount(1, 1, 0);
        int pageNumber = ( int ) Math.ceil(count/40.0);
        model.addAttribute("pageNumber",pageNumber);
        model.addAttribute("count",count);
        model.addAttribute("sortnav","vegetable");
        model.addAttribute("products",productInfos);
        return "supply";
    }
    /*大米页面*/
    @RequestMapping("/supply/rice")
    public String supplyRice(Model model){
        List <ProductInfo> productInfos = productInfoService.getProductInfos(2, 0, 0, new PageUtil(40, 1));
        model.addAttribute("products",productInfos);
        return "";
    }
//    返回对应的商品名称如:西瓜的集合,
    @RequestMapping("/supply/fruit/{ItemName}")
    public String supplyItemFruit(@PathVariable("ItemName") String itemName,Model model){
        int threeSort = Fruit.getId(itemName);
        List <ProductInfo> productInfos = productInfoService.getProductInfos(1, 2, threeSort, new PageUtil(40, 1));
        int count = productInfoService.sortCount(1, 2, threeSort);
        int pageNumber = ( int ) Math.ceil(count/40.0);
        model.addAttribute("pageNumber",pageNumber);
        model.addAttribute("count",count);
        model.addAttribute("sortnav","fruit");
        model.addAttribute("products",productInfos);
        return "supply";
    }
    @RequestMapping("/supply/vegetable/{ItemName}")
    public String supplyItemVegetable(@PathVariable("ItemName") String itemName,Model model){
        int threeSort = Vegetable.getId(itemName);
        List <ProductInfo> productInfos = productInfoService.getProductInfos(1, 1, threeSort, new PageUtil(40, 1));
        int count = productInfoService.sortCount(1, 1, threeSort);
        int pageNumber = ( int ) Math.ceil(count/40.0);
        model.addAttribute("pageNumber",pageNumber);
        model.addAttribute("count",count);
        model.addAttribute("sortnav","vegetable");
        model.addAttribute("products",productInfos);
        return "supply";
    }
}
