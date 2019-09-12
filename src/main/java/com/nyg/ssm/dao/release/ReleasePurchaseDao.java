package com.nyg.ssm.dao.release;

import com.nyg.ssm.entity.Purchase;
import org.apache.ibatis.annotations.Param;


import java.util.List;

/**
 * @Author zjl
 * @Date 2019/9/5 19:40
 */

public interface ReleasePurchaseDao {
    int addPurchase(Purchase purchase);
    int deletePurchase(int id);
    int updataPurchase(Purchase purchase);
    List<Purchase> getPurchases(@Param("page") int page,@Param("size") int size);
    List<Purchase> getNewPurchases(@Param("page") int page,@Param("size") int size);
    int getCount();
}
