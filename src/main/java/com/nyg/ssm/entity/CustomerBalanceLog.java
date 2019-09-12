package com.nyg.ssm.entity;


import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;
@Data

public class CustomerBalanceLog implements Serializable {

  private int balanceId;
  private int customerId;
  private int source;
  private int sourceSn;
  private Date createTime;
  private double amount;

}
