package com.nyg.ssm.service;

import com.nyg.ssm.entity.Purchase;
import org.aspectj.lang.annotation.Pointcut;

import java.util.List;

/**
 * @Author zjl
 * @Date 2019/9/7 16:07
 */
public interface ReleaseService {
    int addPurchase(Purchase purchase);
    int deletePurchase(int id);
    int updataPurchase(Pointcut pointcut);
    List<Purchase> getPurchases(int page,int size);
    List<Purchase> getNewPurchases();
    int getCount();
}
