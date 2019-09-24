package com.nyg.ssm.entity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

public class ProductInfo implements Serializable {
  private int productId;
  private String productCore;
  private String productName;
  private String barCode;
  private ProductPicInfo productPicInfo;
  private int brandId;
  private int oneCategoryId;
  private int twoCategoryId;
  private int threeCategoryId;
  private int supplierId;
  private double price;
  private int averageCost;
  private int publishStatus;
  private int auditStatus;
  private double weight;
  private double length;
  private double height;
  private double width;
  private String colorType;
  @DateTimeFormat(pattern="yyyy-MM-dd")
  private Date productionDate;
  private int shelfLife;
  private String descript;
  private Date indate;
  private Date modifiedTime;

  public int getProductId( ) {
    return productId;
  }

  public void setProductId(int productId) {
    this.productId = productId;
  }

  public String getProductCore( ) {
    return productCore;
  }

  public void setProductCore(String productCore) {
    this.productCore = productCore;
  }

  public String getProductName( ) {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public String getBarCode( ) {
    return barCode;
  }

  public void setBarCode(String barCode) {
    this.barCode = barCode;
  }

  public ProductPicInfo getProductPicInfo( ) {
    return productPicInfo;
  }

  public void setProductPicInfo(ProductPicInfo productPicInfo) {
    this.productPicInfo = productPicInfo;
  }

  public int getBrandId( ) {
    return brandId;
  }

  public void setBrandId(int brandId) {
    this.brandId = brandId;
  }

  public int getOneCategoryId( ) {
    return oneCategoryId;
  }

  public void setOneCategoryId(int oneCategoryId) {
    this.oneCategoryId = oneCategoryId;
  }

  public int getTwoCategoryId( ) {
    return twoCategoryId;
  }

  public void setTwoCategoryId(int twoCategoryId) {
    this.twoCategoryId = twoCategoryId;
  }

  public int getThreeCategoryId( ) {
    return threeCategoryId;
  }

  public void setThreeCategoryId(int threeCategoryId) {
    this.threeCategoryId = threeCategoryId;
  }

  public int getSupplierId( ) {
    return supplierId;
  }

  public void setSupplierId(int supplierId) {
    this.supplierId = supplierId;
  }

  public double getPrice( ) {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getAverageCost( ) {
    return averageCost;
  }

  public void setAverageCost(int averageCost) {
    this.averageCost = averageCost;
  }

  public int getPublishStatus( ) {
    return publishStatus;
  }

  public void setPublishStatus(int publishStatus) {
    this.publishStatus = publishStatus;
  }

  public int getAuditStatus( ) {
    return auditStatus;
  }

  public void setAuditStatus(int auditStatus) {
    this.auditStatus = auditStatus;
  }

  public double getWeight( ) {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public double getLength( ) {
    return length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  public double getHeight( ) {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double getWidth( ) {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public String getColorType( ) {
    return colorType;
  }

  public void setColorType(String colorType) {
    this.colorType = colorType;
  }

  public Date getProductionDate( ) {
    return productionDate;
  }

  public void setProductionDate(Date productionDate) {
    this.productionDate = productionDate;
  }

  public int getShelfLife( ) {
    return shelfLife;
  }

  public void setShelfLife(int shelfLife) {
    this.shelfLife = shelfLife;
  }

  public String getDescript( ) {
    return descript;
  }

  public void setDescript(String descript) {
    this.descript = descript;
  }

  public Date getIndate( ) {
    return indate;
  }

  public void setIndate(Date indate) {
    this.indate = indate;
  }

  public Date getModifiedTime( ) {
    return modifiedTime;
  }

  public void setModifiedTime(Date modifiedTime) {
    this.modifiedTime = modifiedTime;
  }

  @Override
  public String toString( ) {
    return "ProductInfo{" +
            "productId=" + productId +
            ", productCore='" + productCore + '\'' +
            ", productName='" + productName + '\'' +
            ", barCode='" + barCode + '\'' +
            ", productPicInfo=" + productPicInfo +
            ", brandId=" + brandId +
            ", oneCategoryId=" + oneCategoryId +
            ", twoCategoryId=" + twoCategoryId +
            ", threeCategoryId=" + threeCategoryId +
            ", supplierId=" + supplierId +
            ", price=" + price +
            ", averageCost=" + averageCost +
            ", publishStatus=" + publishStatus +
            ", auditStatus=" + auditStatus +
            ", weight=" + weight +
            ", length=" + length +
            ", height=" + height +
            ", width=" + width +
            ", colorType='" + colorType + '\'' +
            ", productionDate=" + productionDate +
            ", shelfLife=" + shelfLife +
            ", descript='" + descript + '\'' +
            ", indate=" + indate +
            ", modifiedTime=" + modifiedTime +
            '}';
  }
}
