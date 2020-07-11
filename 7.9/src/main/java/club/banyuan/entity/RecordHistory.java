package club.banyuan.entity;

public class RecordHistory {
  private Integer id = null;
  private String auctionTime =null;
  private Float auctionPrice = null;
  private Integer userId = null;
  private Integer comId = null;

  public RecordHistory(){};

  public RecordHistory(Integer id, String auctionTime, Float auctionPrice, Integer userId,
      Integer comId) {
    this.id = id;
    this.auctionTime = auctionTime;
    this.auctionPrice = auctionPrice;
    this.userId = userId;
    this.comId = comId;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getAuctionTime() {
    return auctionTime;
  }

  public void setAuctionTime(String auctionTime) {
    this.auctionTime = auctionTime;
  }

  public Float getAuctionPrice() {
    return auctionPrice;
  }

  public void setAuctionPrice(Float auctionPrice) {
    this.auctionPrice = auctionPrice;
  }

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public Integer getComId() {
    return comId;
  }

  public void setComId(Integer comId) {
    this.comId = comId;
  }
}
