package com.nyg.ssm.controller.home;
import com.alibaba.fastjson.JSON;
import com.nyg.ssm.entity.CustomerInf;
import com.nyg.ssm.entity.CustomerLogin;
import com.nyg.ssm.entity.ProductInfo;
import com.nyg.ssm.service.Customersevrice;
import com.nyg.ssm.service.ProductInfoService;
import com.nyg.ssm.service.ReleaseService;
import com.nyg.ssm.utils.CookieUtil;
import com.nyg.ssm.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author zjl
 * @Date 2019/5/28 19:04
 */
@Controller
public class  Index1 {
    @Resource
    private Customersevrice customersevrice ;
    @Resource
    private ProductInfoService productInfoService;
    @Autowired
    private ReleaseService releaseService;
    @RequestMapping("/index")
    public String index(HttpServletRequest request, HttpServletResponse response, Model model){
        String account = CookieUtil.getCookiVauleByName(request,"account");
        String password = CookieUtil.getCookiVauleByName(request,"password");
        CustomerLogin customerLogin = new CustomerLogin();
        customerLogin.setPassword(password);
        customerLogin.setLoginName(account);
        List<ProductInfo> productInfo = productInfoService.findProductInfos(new PageUtil(10,1));
        model.addAttribute("productInfos",productInfo);
        model.addAttribute("newProducts",productInfoService.getNewProducts());
        model.addAttribute("releases",releaseService.getNewPurchases());
        if (account != null && !"".equals(account)){
            int customerId = customersevrice.findCustomer(customerLogin);
            if ( customerId!=0){
                CustomerInf customerInf = customersevrice.findCustomerInfById(customerId);
                request.getSession().setAttribute("customerInf",customerId);
            }else {
                return "home/index";
            }
        }
        return "home/index";
    }
    @RequestMapping("/verificationUser")
    @ResponseBody
    public String verificationUser(String loginName,String password,HttpServletRequest request){
        Map<String,Object> map = new HashMap <String,Object>();
        int customerId = customersevrice.findCustomerByNameAndPsd(loginName,password);
        if ( customerId>0 ){
            map.put("state",1);
        }else {
            map.put("state",0);
        }
        String json = JSON.toJSONString(map);
        return json;
    }

}
