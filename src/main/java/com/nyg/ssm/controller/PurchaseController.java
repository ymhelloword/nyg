package com.nyg.ssm.controller;

import com.nyg.ssm.entity.Purchase;
import com.nyg.ssm.service.RedisService;
import com.nyg.ssm.service.ReleaseService;
import com.nyg.ssm.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author zjl
 * @Date 2019/9/5 19:05
 */
@Controller
public class PurchaseController {
    @Autowired
    private ReleaseService releaseService;
    @RequestMapping(value = "/purchase",method = RequestMethod.GET)
    public String purchase( Model model){
        List <Purchase> purchases = releaseService.getPurchases(1, 10);
        int count = releaseService.getCount( );
        int pageNumber = ( int ) Math.ceil(count/10.0);
        model.addAttribute("pageNumber",pageNumber);
        model.addAttribute("count",count);
        model.addAttribute("purchases",purchases);
        return "purchase";
    }
    @RequestMapping(value = "/purchase/{page}",method = RequestMethod.GET)
    @ResponseBody
    public List<Purchase> purchase(@PathVariable("page") int page,Model model){
        List <Purchase> purchases = releaseService.getPurchases(page, 10);
       return purchases;
    }
}
