package com.nyg.ssm.entity;
import lombok.Data;
import java.util.Date;
@Data
public class BrandInfo {

  private int brandId;
  private String brandName;
  private String telephone;
  private String brandWeb;
  private String brandLogo;
  private String brandDesc;
  private int brandStatus;
  private int brandOrder;
  private Date modifiedTime;

}
