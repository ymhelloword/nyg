package com.nyg.ssm.entity;


import lombok.Data;

import java.util.Date;
@Data
public class WarehouseInfo {

  private int wId;
  private String warehouseSn;
  private String warehoustName;
  private String warehousePhone;
  private String contact;
  private int province;
  private int city;
  private int distrct;
  private String address;
  private int warehouseStatus;
  private Date modifiedTime;

}
