package com.nyg.ssm.service;

import com.nyg.ssm.entity.ProductInfo;
import com.nyg.ssm.entity.ProductPicInfo;
import com.nyg.ssm.entity.page.Page;
import com.nyg.ssm.utils.PageUtil;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.util.List;

public interface ProductInfoService {
    int addProduct(ProductInfo productInfo, CommonsMultipartFile[] commonsMultipartFiles);

    int addProducts(List <ProductInfo> list);

    int deleteProductById(int id);

    int deleteProductByIds(List <Integer> list);

    int updateProduct(ProductInfo productInfo);

    List <ProductInfo> findProductByName(String name);

    ProductInfo getProductSimpleInfoById(int id);

    List <ProductInfo> getProductSimpleInfoByName(String name, PageUtil page);

    ProductPicInfo findItemUrlById(int id);

    List <ProductInfo> findProductInfos(@Param("page") PageUtil pageUtil);

    Page getPageByPageId(Integer currentPage, Integer pageSize, Integer categoryId);

    Integer getPageNumber(Integer categoryId);

    List <ProductInfo> getNewProducts( );

    int getCount( );
//    通过分类的编码找到对应的商品list集合 页码 参数:一级分类,二级分类,三级分类,页码
    List<ProductInfo> getProductInfos(int sort1, int sort2, int sort3, PageUtil page);
//    通过分类得到分类商品的总数
    int sortCount(int sort1, int sort2, int sort3);
}
