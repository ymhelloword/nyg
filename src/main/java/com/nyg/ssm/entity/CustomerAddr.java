package com.nyg.ssm.entity;


import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;
@Data
public class CustomerAddr implements Serializable {
  private int customerAddrId;
  private int customerId;
  private int zip;
  private String province;
  private String address;
  private int isDefault;
  private Date modifiedTime;
}
