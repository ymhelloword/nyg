package com.nyg.ssm.entity;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
/**
 *
 *
 * @dateTime 2019/5/21 19:57
 */
@Data
public class CustomerLevelInf implements Serializable {
  private int customerLevel;
  private String levelName;
  private Integer minPoint;
  private Integer maxPoint;
  private Date modifiedTime;
}
