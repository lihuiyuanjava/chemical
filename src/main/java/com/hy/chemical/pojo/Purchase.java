package com.hy.chemical.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "purchase")
public class Purchase {
@TableId(value = "cid",type = IdType.INPUT)
  private long cid;
  private long userId;
  private String name;
  private String cas;
  private long amount;
  private double price;
  private String priceStatus;
  private double sumPrice;
  private long status;
  private String supplierName;
  private String supplierPhone;
  private String trackingNumber;
  private java.sql.Date createTime;
  private long ann;


  public long getCid() {
    return cid;
  }

  public void setCid(long cid) {
    this.cid = cid;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getCas() {
    return cas;
  }

  public void setCas(String cas) {
    this.cas = cas;
  }


  public long getAmount() {
    return amount;
  }

  public void setAmount(long amount) {
    this.amount = amount;
  }


  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }


  public String getPriceStatus() {
    return priceStatus;
  }

  public void setPriceStatus(String priceStatus) {
    this.priceStatus = priceStatus;
  }


  public double getSumPrice() {
    return sumPrice;
  }

  public void setSumPrice(double sumPrice) {
    this.sumPrice = sumPrice;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }


  public String getSupplierName() {
    return supplierName;
  }

  public void setSupplierName(String supplierName) {
    this.supplierName = supplierName;
  }


  public String getSupplierPhone() {
    return supplierPhone;
  }

  public void setSupplierPhone(String supplierPhone) {
    this.supplierPhone = supplierPhone;
  }


  public String getTrackingNumber() {
    return trackingNumber;
  }

  public void setTrackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
  }


  public java.sql.Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Date createTime) {
    this.createTime = createTime;
  }


  public long getAnn() {
    return ann;
  }

  public void setAnn(long ann) {
    this.ann = ann;
  }

}
