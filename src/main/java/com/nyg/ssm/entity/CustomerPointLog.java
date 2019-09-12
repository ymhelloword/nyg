package com.nyg.ssm.entity;
import lombok.Data;
import org.springframework.stereotype.Component;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
@Data
public class CustomerPointLog implements Serializable {
  private int pointId;
  @NotNull
  private int customerId;
  @NotNull
  private int source;
  @NotNull
  private int referNumber;
  @NotNull
  private int changePoint;
  @NotNull
  private Date createTime;

}
