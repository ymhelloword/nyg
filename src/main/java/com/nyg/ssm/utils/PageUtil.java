package com.nyg.ssm.utils;

import lombok.Data;

/**
 * @Author zjl
 * @Date 2019/6/9 20:11
 */
@Data
public class PageUtil {
    private int size;
    private int numbPages;
    public PageUtil(int size,int numbPages){
        this.size=size;
        this.numbPages=size*(numbPages-1);
    }
}
