package club.banyuan.entity;

import java.util.Date;

public class Commodity {
private Integer id = null;
private String commodityName = null;
private float initialPrice = 0;
private float floorPrice = 0;
private String startTime = null;
private String endTime = null;
private String describe = null;

  @Override
  public String toString() {
    return "Commodity{" +
        "id=" + id +
        ", commodityName='" + commodityName + '\'' +
        ", initialPrice=" + initialPrice +
        ", floorPrice=" + floorPrice +
        ", startTime=" + startTime +
        ", endTime=" + endTime +
        ", describe='" + describe + '\'' +
        '}';
  }

  public Commodity(Integer id, String commodityName, float initialPrice, float floorPrice,
      String startTime, String endTime, String describe) {
    this.id = id;
    this.commodityName = commodityName;
    this.initialPrice = initialPrice;
    this.floorPrice = floorPrice;
    this.startTime = startTime;
    this.endTime = endTime;
    this.describe = describe;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getCommodityName() {
    return commodityName;
  }

  public void setCommodityName(String commodityName) {
    this.commodityName = commodityName;
  }

  public float getInitialPrice() {
    return initialPrice;
  }

  public void setInitialPrice(float initialPrice) {
    this.initialPrice = initialPrice;
  }

  public float getFloorPrice() {
    return floorPrice;
  }

  public void setFloorPrice(float floorPrice) {
    this.floorPrice = floorPrice;
  }

  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public String getDescribe() {
    return describe;
  }

  public void setDescribe(String describe) {
    this.describe = describe;
  }
}

