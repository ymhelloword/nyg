package com.nyg.ssm.controller;

import com.nyg.ssm.entity.Purchase;
import com.nyg.ssm.service.ReleaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author zjl
 * @Date 2019/9/5 19:30
 */
@Controller
public class ReleasePurchase {
    @Autowired
    private ReleaseService releaseService;
    @RequestMapping("/releasepurchase")
    public String release(){
        return "releasepurchase";
    }
    @RequestMapping(value = "/purchase",method = RequestMethod.POST)
    @ResponseBody
    public int addPurchase(Purchase purchase){
        return releaseService.addPurchase(purchase);
    }
}
