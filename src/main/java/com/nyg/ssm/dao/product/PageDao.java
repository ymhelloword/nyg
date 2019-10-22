package com.nyg.ssm.dao.product;

import com.nyg.ssm.entity.ProductInfo;
import com.nyg.ssm.entity.page.Page;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author zjl
 * @Date 2019/7/30 15:39
 */
public interface PageDao {
     List<ProductInfo> queryCurrentData(@Param("page") Integer currentPage,@Param("size") Integer pageSize,@Param("categoryId") Integer categoryId);
     Integer getPageNumber(@Param("categoryId") Integer categoryId);
}
