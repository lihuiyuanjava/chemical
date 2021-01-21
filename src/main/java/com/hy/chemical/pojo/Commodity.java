package com.hy.chemical.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "commodity")
public class Commodity {
@TableId(value = "sid",type = IdType.INPUT)
  private long sid;
  private String name;
  private String cas;
  private long userId;
  private String priceInfo;
  private String commodityInfo;
  private String imgStatus;
  private String imgPath;
  private String fileStatus;
  private String filePath;
  private long supplierId;
  private java.sql.Date createTime;
  private java.sql.Date updateTime;


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


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public String getPriceInfo() {
    return priceInfo;
  }

  public void setPriceInfo(String priceInfo) {
    this.priceInfo = priceInfo;
  }


  public String getCommodityInfo() {
    return commodityInfo;
  }

  public void setCommodityInfo(String commodityInfo) {
    this.commodityInfo = commodityInfo;
  }


  public String getImgStatus() {
    return imgStatus;
  }

  public void setImgStatus(String imgStatus) {
    this.imgStatus = imgStatus;
  }


  public String getImgPath() {
    return imgPath;
  }

  public void setImgPath(String imgPath) {
    this.imgPath = imgPath;
  }


  public String getFileStatus() {
    return fileStatus;
  }

  public void setFileStatus(String fileStatus) {
    this.fileStatus = fileStatus;
  }


  public String getFilePath() {
    return filePath;
  }

  public void setFilePath(String filePath) {
    this.filePath = filePath;
  }


  public long getSupplierId() {
    return supplierId;
  }

  public void setSupplierId(long supplierId) {
    this.supplierId = supplierId;
  }


  public java.sql.Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Date createTime) {
    this.createTime = createTime;
  }


  public java.sql.Date getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(java.sql.Date updateTime) {
    this.updateTime = updateTime;
  }

}
