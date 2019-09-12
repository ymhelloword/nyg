package com.nyg.ssm.entity;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
public class ProductComment implements Serializable {

  private int commentId;
  private int productId;
  private int orderId;
  private int customerId;
  private String title;
  private String content;
  private int auditStatus;
  private Date auditTime;
  private Date modifiedTime;

}
