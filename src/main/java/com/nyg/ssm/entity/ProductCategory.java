package com.nyg.ssm.entity;


import java.io.Serializable;
import java.util.Date;

public class ProductCategory implements Serializable {

  private int categoryId;
  private String categoryName;
  private String categoryCode;
  private int parentId;
  private int categoryLevel;
  private int categoryStatus;
  private Date modifiedTime;

}
