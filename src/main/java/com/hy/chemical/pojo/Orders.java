package com.hy.chemical.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "order")
public class Orders {
@TableId(value = "did",type = IdType.INPUT)
  private long did;
  private long userId;
  private double amount;
  private double price;
  private double costPrice;
  private double royalties;
  private double otherCost;
  private String bill;
  private String billInfo;
  private long commodityId;
  private long invoiceId;
  private String status;
  private String userName;
  private String address;
  private String phone;
  private java.sql.Timestamp createTime;
  private String remarks;


  public long getDid() {
    return did;
  }

  public void setDid(long did) {
    this.did = did;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }


  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }


  public double getCostPrice() {
    return costPrice;
  }

  public void setCostPrice(double costPrice) {
    this.costPrice = costPrice;
  }


  public double getRoyalties() {
    return royalties;
  }

  public void setRoyalties(double royalties) {
    this.royalties = royalties;
  }


  public double getOtherCost() {
    return otherCost;
  }

  public void setOtherCost(double otherCost) {
    this.otherCost = otherCost;
  }


  public String getBill() {
    return bill;
  }

  public void setBill(String bill) {
    this.bill = bill;
  }


  public String getBillInfo() {
    return billInfo;
  }

  public void setBillInfo(String billInfo) {
    this.billInfo = billInfo;
  }


  public long getCommodityId() {
    return commodityId;
  }

  public void setCommodityId(long commodityId) {
    this.commodityId = commodityId;
  }


  public long getInvoiceId() {
    return invoiceId;
  }

  public void setInvoiceId(long invoiceId) {
    this.invoiceId = invoiceId;
  }


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }

}
