package com.nyg.ssm.service.impl;
import com.nyg.ssm.dao.product.PageDao;
import com.nyg.ssm.dao.product.ProductDao;
import com.nyg.ssm.entity.ProductInfo;
import com.nyg.ssm.entity.ProductPicInfo;
import com.nyg.ssm.entity.page.Page;
import com.nyg.ssm.service.ProductInfoService;
import com.nyg.ssm.service.RedisService;
import com.nyg.ssm.utils.PageUtil;
import com.nyg.ssm.utils.RedisUtil;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.data.redis.core.RedisTemplate;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * @Author zjl
 * @Date 2019/6/9 20:29
 */
@Service
public class ProductInfoServiceImpl implements ProductInfoService {
    @Autowired
    private ProductDao productDao;
    @Autowired
    private RedisTemplate<String,Object> redisTemplate;
    @Autowired
    private PageDao pageDao;
    @Autowired
    private RedisUtil redisUtil;
    @Override
    public int addProduct(ProductInfo productInfo, CommonsMultipartFile[] commonsMultipartFiles) {
        int a = 0;
        a = productDao.addProduct(productInfo);
        if ( !StringUtils.isEmpty(commonsMultipartFiles) ){
            for ( int i=0;i<commonsMultipartFiles.length;i++ ){
                String fileType = commonsMultipartFiles[i].getOriginalFilename().substring(commonsMultipartFiles[i].getOriginalFilename().lastIndexOf("."));
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String fileName = simpleDateFormat.format(new Date())+"_"+productInfo.getProductId()+"_"+(i+1);
                File file = new File("/usr/local/static/imgs/item-img/"+fileName+fileType);
                try {
                    FileUtils.writeByteArrayToFile(file,commonsMultipartFiles[i].getBytes());
                } catch ( IOException e ) {
                    e.printStackTrace();
                }
                ProductPicInfo productPicInfo = new ProductPicInfo();
                productPicInfo.setProductId(productInfo.getProductId());
                productPicInfo.setPicStatus(1);
                productPicInfo.setPicUrl("/imgs/item-img/"+fileName+fileType);
                productPicInfo.setPicOrder(i+1);
                if(i==0){
                    productPicInfo.setIsMaster(1);
                }
                productPicInfo.setModifiedTime(new Date());
                System.out.println(productPicInfo) ;
                productDao.addProductPicInfo(productPicInfo);
            }
        }
        return a;
    }

    @Override
    public int addProducts(List <ProductInfo> list) {
        return 0;
    }

    @Override
    public int deleteProductById(int id) {
        return 0;
    }

    @Override
    public int deleteProductByIds(List <Integer> list) {
        return 0;
    }

    @Override
    public int updateProduct(ProductInfo productInfo) {
        return 0;
    }

    @Override
    public List <ProductInfo> findProductByName(String name) {
        return null;
    }

    @Override
    public ProductInfo getProductSimpleInfoById(int id) {
        return productDao.getProductSimpleInfoById(id);
    }

    @Override
    public List <ProductInfo> getProductSimpleInfoByName(String name,PageUtil page) {
        return productDao.findProductByName(name,page);
    }

    @Override
    public ProductPicInfo findItemUrlById(int id) {
        return null;
    }


    @Override
    public List<ProductInfo> findProductInfos(PageUtil pageUtil) {
        if ( redisUtil.existsKey("productInfos") ){
            List<ProductInfo> productInfos = ( List <ProductInfo> ) redisUtil.getForValue("productInfos");
            return productInfos;
        }else {
            List <ProductInfo> productInfos1 = productDao.findProductInfos(pageUtil, 2, 1);
            List <ProductInfo> productInfos3 = productDao.findProductInfos(pageUtil, 1, 2);
            List <ProductInfo> productInfos4 = productDao.findProductInfos(pageUtil,1,1);
            List<ProductInfo> productInfos = new ArrayList <ProductInfo>();
            productInfos.addAll(productInfos1);
            productInfos.addAll(productInfos3);
            productInfos.addAll(productInfos4);
            redisUtil.set("productInfos",productInfos);
            return productInfos;
        }

    }

    @Override
    public Page getPageByPageId(Integer currentPage, Integer pageSize,Integer categoryId) {
        currentPage = currentPage<=0?0:(currentPage-1)*pageSize;
        int pageNumber = getPageNumber(categoryId);
        currentPage = currentPage>pageNumber?pageNumber:currentPage;
        List<ProductInfo> list = pageDao.queryCurrentData(currentPage,pageSize,categoryId);
        Page page = new Page();
        page.setCurrentPage(currentPage);
        page.setData(list);
        page.setTotalCount(pageNumber);
        System.out.println(page) ;
        return page;
    }

    @Override
    public Integer getPageNumber(Integer categoryId) {
        return pageDao.getPageNumber(categoryId);
    }

    @Override
    public List <ProductInfo> getProductInfos(int sort1, int sort2, int sort3, PageUtil page) {

        return productDao.getProductInfos(sort1, sort2, sort3, page);
    }

    @Override
    public int getCount( ) {
        return productDao.getCount();
    }

    @Override
    public List <ProductInfo> getNewProducts( ) {
        int newProductId = productDao.getNewProductId();
        List<ProductInfo> list = new ArrayList <>();
        for ( int a=newProductId-4;a<newProductId;a++){
            list.add(productDao.getProductSimpleInfoById(a));
        }
        System.out.println(list) ;
        return list;
    }

    @Override
    public int sortCount(int sort1, int sort2, int sort3) {
        return productDao.sortCount(sort1,sort2,sort3);
    }
}
