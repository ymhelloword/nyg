package com.nyg.ssm.service.impl;

import com.nyg.ssm.dao.release.ReleasePurchaseDao;
import com.nyg.ssm.entity.Purchase;
import com.nyg.ssm.service.ReleaseService;
import com.nyg.ssm.utils.RedisUtil;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;

/**
 * @Author zjl
 * @Date 2019/9/7 16:09
 */
@Service
public class ReleaseServiceImpl implements ReleaseService {
    @Autowired
    private ReleasePurchaseDao releasePurchaseDao;
    @Autowired
    private RedisUtil redisUtil;
    @Override
    public int addPurchase(Purchase purchase) {
        purchase.setCreateTime(new Date());
        purchase.setModifiedTime(new Date());
        return releasePurchaseDao.addPurchase(purchase);
    }
    @Override
    public int deletePurchase(int id) {
        return releasePurchaseDao.deletePurchase(id);
    }

    @Override
    public int updataPurchase(Pointcut pointcut) {
        return 0;
    }

    @Override
    public int getCount( ) {
        return releasePurchaseDao.getCount();
    }

    @Override
    public List <Purchase> getNewPurchases( ) {
        int count = releasePurchaseDao.getCount( );
        return releasePurchaseDao.getNewPurchases(count-4,4);
    }

    @Override
    public List<Purchase> getPurchases(int page,int size ) {
        page = (page-1)*size;
        if ( redisUtil.existsKey("ReleasePage"+page) ){
            List<Purchase> purchases = ( List <Purchase> ) redisUtil.getForValue("ReleasePage" + page);
            return purchases;
        }else {
            List <Purchase> purchases = releasePurchaseDao.getPurchases(page, size);
            redisUtil.set("ReleasePage"+page,purchases,24);
            return purchases;
        }

    }
}
