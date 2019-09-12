package com.nyg.ssm.service;

import com.nyg.ssm.entity.ProductInfo;
import com.nyg.ssm.entity.ProductPicInfo;
import com.nyg.ssm.entity.page.Page;
import com.nyg.ssm.utils.PageUtil;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.util.List;

public interface ProductInfoService {
    public int addProduct(ProductInfo productInfo, CommonsMultipartFile[] commonsMultipartFiles);
    public int addProducts(List <ProductInfo> list);
    public int deleteProductById(int id);
    public int deleteProductByIds(List<Integer> list);
    public int updateProduct(ProductInfo productInfo);
    public List<ProductInfo> findProductByName(String name);
    public ProductInfo getProductSimpleInfoById(int id);
    public List<ProductInfo> getProductSimpleInfoByName(String name,PageUtil page);
    public ProductPicInfo findItemUrlById(int id);
    public List<ProductInfo> findProductInfos(@Param("page") PageUtil pageUtil);
    public Page getPageByPageId(Integer currentPage,Integer pageSize,Integer categoryId);
    public Integer getPageNumber(Integer categoryId);
    public List<ProductInfo> getNewProducts();
    int getCount();
}
