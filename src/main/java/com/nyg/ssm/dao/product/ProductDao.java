package com.nyg.ssm.dao.product;
import com.nyg.ssm.entity.ProductInfo;
import com.nyg.ssm.entity.ProductPicInfo;
import com.nyg.ssm.utils.PageUtil;
import org.apache.ibatis.annotations.Param;

import java.util.List;
public interface ProductDao {
    public int addProduct(ProductInfo productInfo);
    public int addProductPicInfo(ProductPicInfo productPicInfo);
    public int addProducts(List<ProductInfo> list);
    public int deleteProductById(int id);
    public int deleteProductByIds(List<Integer> list);
    public int updateProduct(ProductInfo productInfo);
    public ProductInfo findProductInfoSimplById(int id);
    public List<ProductInfo> findProductByName(@Param("productName") String productName,@Param("page") PageUtil page);
    public ProductInfo getProductSimpleInfoById(int id);
    public List<ProductInfo> getProductSimpleInfoByName(String name);
    public ProductPicInfo findItemUrlById(int id);
    public List<ProductInfo> findProductInfos(@Param("page") PageUtil pageUtil,@Param("kind_1") int kind_1,@Param("kind_2") int kind_2);
    public int getNewProductId();
    int getCount();
}
