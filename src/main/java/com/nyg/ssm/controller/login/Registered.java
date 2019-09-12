package com.nyg.ssm.controller.login;
import com.alibaba.fastjson.JSON;
import com.nyg.ssm.entity.CustomerInf;
import com.nyg.ssm.entity.CustomerLogin;
import com.nyg.ssm.service.Customersevrice;
import com.nyg.ssm.utils.MD5Util;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @Author zjl
 * @Date 2019/5/26 15:30
 */
@Controller
@RequestMapping(value = "/signup")
public class Registered {
    @Resource
    private Customersevrice customersevrice;
    @ResponseBody
    @RequestMapping(value = "/registered", method = RequestMethod.POST)
    public int signup( @Validated CustomerLogin customerLogin, HttpServletRequest request,@RequestParam("file") CommonsMultipartFile commonsMultipartFile) {

        Map <String, Object> map = new HashMap <>();
        String MD5pwd = MD5Util.MD5Encode(customerLogin.getPassword( ), "UTF-8");
        customerLogin.setPassword(MD5pwd);
        customerLogin.setModifiedTime(new Date( ));
        int cout = customersevrice.finAccount(customerLogin.getLoginName( ));
        customersevrice.addCustomerLogin(customerLogin);
        CustomerInf customerInf = new CustomerInf( );
        customerInf.setCustomerId(customerLogin.getCustomerId( ));
        customerInf.setUserPoint(0);
        customerInf.setRegisterTime(new Date( ));
        customerInf.setCustomerLevel(1);
        customerInf.setModifiedTime(new Date( ));
        int status = customersevrice.addCustomerInf(customerInf,commonsMultipartFile);
        return status;
    }
    @RequestMapping(value = "/check",method = RequestMethod.POST)
    @ResponseBody
    public String accountVerification(String account){
        System.out.println(account) ;
        Map<String,Integer> map = new HashMap <String, Integer>();
        int count = customersevrice.finAccount(account);
        System.out.println(count) ;
        if (count>0){
                map.put("msg",1);
        }else {
                map.put("msg",0);
         }
        return JSON.toJSONString(map);
    }
}
