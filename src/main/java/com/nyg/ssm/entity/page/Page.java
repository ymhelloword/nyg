package com.nyg.ssm.entity.page;

import com.nyg.ssm.entity.ProductInfo;
import lombok.Data;

import java.util.List;

/**
 * @Author zjl
 * @Date 2019/7/30 15:04
 */
public class Page {
    private List <ProductInfo> data;//当前页的数据
    private Integer firstPage;//首页
    private Integer prePage;//上一页
    private Integer nextPage;//下一页
    private Integer totalPage;//末页、总页数
    private Integer currentPage;//当前页
    private Integer totalCount;//总记录数
    private Integer pageSize;//每页显示的记录数

    public List <ProductInfo> getData( ) {
        return data;
    }

    public void setData(List <ProductInfo> data) {
        this.data = data;
    }

    public Integer getFirstPage( ) {
        return firstPage;
    }

    public void setFirstPage(Integer firstPage) {
        this.firstPage = firstPage;
    }

    public Integer getPrePage( ) {
        return prePage;
    }

    public void setPrePage(Integer prePage) {
        this.prePage = prePage;
    }

    public Integer getNextPage( ) {
        return nextPage;
    }

    public void setNextPage(Integer nextPage) {
        this.nextPage = nextPage;
    }

    public Integer getTotalPage( ) {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getCurrentPage( ) {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getTotalCount( ) {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getPageSize( ) {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
