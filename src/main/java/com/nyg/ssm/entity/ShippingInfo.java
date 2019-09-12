package com.nyg.ssm.entity;


import lombok.Data;

import java.util.Date;
@Data
public class ShippingInfo {

  private int shipId;
  private String shipName;
  private String shipContact;
  private String telephone;
  private double price;
  private Date modifiedTime;

}
