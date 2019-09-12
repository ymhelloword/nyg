package com.nyg.ssm.entity;


import java.util.Date;

public class Purchase {

  private long id;
  private long customerId;
  private String productName;
  private double productPrice;
  private String productQuantity;
  private String placeOfOrgin;
  private Date modifiedTime;
  private Date createTime;

  public long getId( ) {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getCustomerId( ) {
    return customerId;
  }

  public void setCustomerId(long customerId) {
    this.customerId = customerId;
  }

  public String getProductName( ) {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public double getProductPrice( ) {
    return productPrice;
  }

  public void setProductPrice(double productPrice) {
    this.productPrice = productPrice;
  }

  public String getProductQuantity( ) {
    return productQuantity;
  }

  public void setProductQuantity(String productQuantity) {
    this.productQuantity = productQuantity;
  }

  public String getPlaceOfOrgin( ) {
    return placeOfOrgin;
  }

  public void setPlaceOfOrgin(String placeOfOrgin) {
    this.placeOfOrgin = placeOfOrgin;
  }

  public Date getModifiedTime( ) {
    return modifiedTime;
  }

  public void setModifiedTime(Date modifiedTime) {
    this.modifiedTime = modifiedTime;
  }

  public Date getCreateTime( ) {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  @Override
  public String toString( ) {
    return "Purchase{" +
            "id=" + id +
            ", customerId=" + customerId +
            ", productName='" + productName + '\'' +
            ", productPrice=" + productPrice +
            ", productQuantity=" + productQuantity +
            ", placeOfOrgin='" + placeOfOrgin + '\'' +
            ", modifiedTime=" + modifiedTime +
            ", createTime=" + createTime +
            '}';
  }
}
