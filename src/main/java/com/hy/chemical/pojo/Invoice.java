package com.hy.chemical.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "invoice")
public class Invoice {
@TableId(value = "sid",type = IdType.INPUT)
  private long sid;
  private String name;
  private String cas;
  private double number;
  private double price;
  private java.sql.Timestamp createTime;
  private String unit;


  public long getSid() {
    return sid;
  }

  public void setSid(long sid) {
    this.sid = sid;
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


  public double getNumber() {
    return number;
  }

  public void setNumber(double number) {
    this.number = number;
  }


  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

}
