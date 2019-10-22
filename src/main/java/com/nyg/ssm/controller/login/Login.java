package com.nyg.ssm.controller.login;

import cn.hutool.http.HttpRequest;
import com.alibaba.fastjson.JSON;
import com.nyg.ssm.entity.CustomerLogin;
import com.nyg.ssm.entity.CustomerLoginLog;
import com.nyg.ssm.service.CustomerserviceLoginLog;
import com.nyg.ssm.service.impl.CustomerSevriceImp;
import com.nyg.ssm.service.impl.LoginLogserviceImpl;
import com.nyg.ssm.utils.IpUtil;
import com.nyg.ssm.utils.MD5Util;
import com.nyg.ssm.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author zjl
 * @Date 2019/6/12 16:50
 */
@Controller
public class Login {
    @Autowired
    private CustomerSevriceImp customerService;
    @Autowired
    private LoginLogserviceImpl loginLogservice;
    @Autowired
    private RedisUtil redisUtil;
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(){
        return "login";
    }
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public String login1(CustomerLogin customerLogin, HttpServletRequest request){
        Map<String,Object> map = new HashMap <String, Object>();
        String password = MD5Util.MD5Encode(customerLogin.getPassword(),"utf-8");
        customerLogin.setPassword(password);
        String ip = IpUtil.getIpAddr(request);
        Integer customerId = customerService.findCustomer(customerLogin);
        if (null != customerId && customerId != 0){
            request.getSession().setAttribute("customerId",customerId);
            request.getSession().setAttribute("account",customerLogin.getLoginName());
            CustomerLoginLog customerLoginLog = new CustomerLoginLog();
            customerLoginLog.setCustomerId(customerId);
            customerLoginLog.setLoginIp(ip);
            customerLoginLog.setLoginTime(new Date());
            customerLoginLog.setLoginType(1);
            loginLogservice.addLoginLog(customerLoginLog);
            map.put("msg",1);
            map.put("loginName",customerLogin.getLoginName());
            map.put("password",password);
        }else{
            map.put("msg",0);
        }
        return JSON.toJSONString(map);
    }
//    查看用户是否登录
    @RequestMapping(value = "/checkLogin",method = RequestMethod.POST)
    @ResponseBody
    public String checkLogin(HttpServletRequest request){
        String account = ( String ) request.getSession().getAttribute("account");
        if ( StringUtils.isEmpty(account) ){
            return "0"; //还未登录
        }else {
            return "1"; //已经登录
        }
    }
    /*
     *重置密码
     */
    @RequestMapping(value = "/updatePwd",method = RequestMethod.POST)
    public int updatePassword(@RequestParam("phoneNumber") String phoneNumber,
                              @RequestParam("pwd") String pwd,
                              @RequestParam("code") String code,
                              HttpServletRequest request){
        if (StringUtils.isEmpty(phoneNumber)|| StringUtils.isEmpty(pwd)||StringUtils.isEmpty(code)){

            return 0;
        }else {
            String redisPhoneNumber = ( String ) redisUtil.getForValue(phoneNumber);
            if ( redisPhoneNumber.equals(code) ){
                pwd =  MD5Util.MD5Encode(pwd,"utf-8");
                int i = customerService.updatePassword(phoneNumber, pwd);
                return i;
            }else {
                return 0;
            }

        }

    }
}
