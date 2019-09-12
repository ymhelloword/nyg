package com.nyg.ssm.entity;


import lombok.Data;

import java.util.Date;
@Data
public class OrderDetail {

  private int orderDetailId;
  private int orderId;
  private int productId;
  private String productName;
  private int productCnt;
  private double productPrice;
  private double averageCost;
  private double weight;
  private double feeMoney;
  private int wId;
  private Date modifiedTime;
}
