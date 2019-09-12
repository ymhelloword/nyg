package com.nyg.ssm.controller.test;

import com.nyg.ssm.entity.ProductInfo;
import com.nyg.ssm.service.ProductInfoService;
import com.nyg.ssm.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author zjl
 * @Date 2019/8/31 21:11
 */
@Controller
public class RedisTest {
    @Autowired
    private RedisTemplate <String, Object> redisTemplate;
    @Autowired
    private ProductInfoService productInfoService;
    @RequestMapping(value = "/rids",method = RequestMethod.GET)
    @ResponseBody
    public String redisTest(){
        Boolean name = redisTemplate.hasKey("name");
        List <ProductInfo> productInfos = productInfoService.findProductInfos(new PageUtil(10, 1));
        redisTemplate.opsForValue().set("aaa",productInfos);
        return productInfos.toString();
    }
}
