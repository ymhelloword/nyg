package com.nyg.ssm.entity;


import lombok.Data;

import java.util.Date;
@Data
public class OrderCart {

  private int cartId;
  private int customerId;
  private int productId;
  private int productAmount;
  private double price;
  private Date addTime;
  private Date modifiedTime;
}
