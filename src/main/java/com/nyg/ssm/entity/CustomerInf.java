package com.nyg.ssm.entity;

import lombok.Data;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
@Data
public class CustomerInf implements Serializable {
  private int customerInfId;
  @NotNull
  private int customerId;
  private String customerName;
  private long mobilePhone;
  private String customerEmail;
  private int gender;
  private long userPoint;
  private Date registerTime;
  private Date birthday;
  private long customerLevel;
  private Date modifiedTime;
  private String headPortrait;
}
