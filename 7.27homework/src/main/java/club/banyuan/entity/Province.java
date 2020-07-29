package club.banyuan.entity;

public class Province {
private Integer id ;
private String province;

  public Province(){}

  public Province(Integer id, String province) {
    this.id = id;
    this.province = province;
  }

  @Override
  public String toString() {
    return "Province{" +
        "id=" + id +
        ", province='" + province + '\'' +
        '}';
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }
}
