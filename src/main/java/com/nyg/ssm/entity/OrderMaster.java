package com.nyg.ssm.entity;


import java.util.Date;

public class OrderMaster {

  private int orderId;
  private int orderSn;
  private int customerId;
  private String shippingUser;
  private int province;
  private int city;
  private int district;
  private String address;
  private int paymentMethod;
  private double orderMoney;
  private double districtMoney;
  private double shippingMoney;
  private double paymentMoney;
  private String shippingCompName;
  private String shippingSn;
  private Date createTime;
  private Date shippingTime;
  private Date payTime;
  private Date receiveTime;
  private Date orderStatus;
  private Date orderPoint;
  private String invoiceTime;
  private Date modifiedTime;

}
