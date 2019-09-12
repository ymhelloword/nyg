package com.nyg.ssm.entity;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.util.Date;

/**
 *@author ym
 * @dateTime 2019/5/21 19:47
 */
@Data
public class CustomerLogin implements Serializable {
  private Integer customerId;
  @NotNull
  @Pattern(regexp = "^[A-Za-z0-9]{6,12}$")
  private String loginName;
  @NotNull
  @Pattern(regexp = "^[A-Za-z0-9\\.]{6,18}$")
  private String password;
  @Null
  private Integer userStats;
  @Null
  @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private Date modifiedTime;
}
