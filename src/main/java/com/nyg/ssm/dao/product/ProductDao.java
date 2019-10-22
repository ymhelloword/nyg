package com.nyg.ssm.dao.product;
import com.nyg.ssm.entity.ProductInfo;
import com.nyg.ssm.entity.ProductPicInfo;
import com.nyg.ssm.utils.PageUtil;
import org.apache.ibatis.annotations.Param;

import java.util.List;
public interface ProductDao {
    int addProduct(ProductInfo productInfo);
    int addProductPicInfo(ProductPicInfo productPicInfo);
    int addProducts(List<ProductInfo> list);
    int deleteProductById(int id);
    int deleteProductByIds(List<Integer> list);
    int updateProduct(ProductInfo productInfo);
    ProductInfo findProductInfoSimplById(int id);
    List<ProductInfo> findProductByName(@Param("productName") String productName,@Param("page") PageUtil page);
    ProductInfo getProductSimpleInfoById(int id);
    List<ProductInfo> getProductSimpleInfoByName(String name);
    ProductPicInfo findItemUrlById(int id);
    List<ProductInfo> findProductInfos(@Param("page") PageUtil pageUtil,@Param("kind_1") int kind_1,@Param("kind_2") int kind_2);
    int getNewProductId();
    int getCount();
    List <ProductInfo> getProductInfos(@Param("sort1") int sort1,@Param("sort2") int sort2,@Param("sort3") int sort3,@Param("page") PageUtil page);
    int sortCount(@Param("sort1") int sort1,@Param("sort2") int sort2,@Param("sort3") int sort3);
}
