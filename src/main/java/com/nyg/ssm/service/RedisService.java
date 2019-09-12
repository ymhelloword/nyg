package com.nyg.ssm.service;

import com.nyg.ssm.entity.ProductInfo;
import com.nyg.ssm.entity.Purchase;
import com.nyg.ssm.entity.page.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.List;

/**
 * @Author zjl
 * @Date 2019/9/10 20:05
 */
@Service
public class RedisService {
    @Autowired
    private RedisTemplate<String,Object> redisTemplate;
    public void saveProductInfo(List<ProductInfo> productInfos){
        redisTemplate.opsForValue().set("productInfo1",productInfos);
    }
}
