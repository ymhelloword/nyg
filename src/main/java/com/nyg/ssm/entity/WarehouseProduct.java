package com.nyg.ssm.entity;


import lombok.Data;

import java.util.Date;
@Data
public class WarehouseProduct {

  private int wpId;
  private int productId;
  private int wId;
  private int currentCnt;
  private int lockCnt;
  private int inTransitCnt;
  private double averageCost;
  private Date modifiedTime;

}
