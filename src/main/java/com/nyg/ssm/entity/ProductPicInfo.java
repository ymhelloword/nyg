package com.nyg.ssm.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

public class ProductPicInfo implements Serializable {

  private int productPicId;
  private int productId;
  private String picDesc;
  private String picUrl;
  private int isMaster;
  private int picOrder;
  private int picStatus;
  private Date modifiedTime;

  public int getProductPicId( ) {
    return productPicId;
  }

  public void setProductPicId(int productPicId) {
    this.productPicId = productPicId;
  }

  public int getProductId( ) {
    return productId;
  }

  public void setProductId(int productId) {
    this.productId = productId;
  }

  public String getPicDesc( ) {
    return picDesc;
  }

  public void setPicDesc(String picDesc) {
    this.picDesc = picDesc;
  }

  public String getPicUrl( ) {
    return picUrl;
  }

  public void setPicUrl(String picUrl) {
    this.picUrl = picUrl;
  }

  public int getIsMaster( ) {
    return isMaster;
  }

  public void setIsMaster(int isMaster) {
    this.isMaster = isMaster;
  }

  public int getPicOrder( ) {
    return picOrder;
  }

  public void setPicOrder(int picOrder) {
    this.picOrder = picOrder;
  }

  public int getPicStatus( ) {
    return picStatus;
  }

  public void setPicStatus(int picStatus) {
    this.picStatus = picStatus;
  }

  public Date getModifiedTime( ) {
    return modifiedTime;
  }

  @Override
  public String toString( ) {
    return "ProductPicInfo{" +
            "productPicId=" + productPicId +
            ", productId=" + productId +
            ", picDesc='" + picDesc + '\'' +
            ", picUrl='" + picUrl + '\'' +
            ", isMaster=" + isMaster +
            ", picOrder=" + picOrder +
            ", picStatus=" + picStatus +
            ", modifiedTime=" + modifiedTime +
            '}';
  }

  public void setModifiedTime(Date modifiedTime) {
    this.modifiedTime = modifiedTime;
  }
}
