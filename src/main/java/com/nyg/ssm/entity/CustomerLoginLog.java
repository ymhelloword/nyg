package com.nyg.ssm.entity;


import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;
@Data
public class CustomerLoginLog implements Serializable {

  private int loginId;
  private int customerId;
  private Date loginTime;
  private String loginIp;
  private int loginType;

}
