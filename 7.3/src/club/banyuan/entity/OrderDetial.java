package club.banyuan.entity;

public class OrderDetial {
private Integer id = null;
private Integer userid = null;
private String loginName = null;
private String createTime = null;
private double cost = 0;
private String serialNumber = null;


  public OrderDetial(Integer id, Integer userid, String loginName, String createTime, double cost,
      String serialNumber) {
    this.id = id;
    this.userid = userid;
    this.loginName = loginName;
    this.createTime = createTime;
    this.cost = cost;
    this.serialNumber = serialNumber;
  }

  @Override
  public String toString() {
    return "OrderDetial{" +
        "id=" + id +
        ", usrid=" + userid +
        ", loginName='" + loginName + '\'' +
        ", createTime='" + createTime + '\'' +
        ", cost=" + cost +
        ", serialNumber='" + serialNumber + '\'' +
        '}';
  }

  public OrderDetial() {

  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getUserid() {
    return userid;
  }

  public void setUserId(Integer usrid) {
    this.userid = usrid;
  }

  public String getLoginName() {
    return loginName;
  }

  public void setLoginName(String loginName) {
    this.loginName = loginName;
  }

  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }

  public double getCost() {
    return cost;
  }

  public void setCost(double cost) {
    this.cost = cost;
  }

  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }
}
