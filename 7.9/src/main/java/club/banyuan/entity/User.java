package club.banyuan.entity;

public class User {
private Integer id = null;
private String username = null;
private String password = null;
private String identitynumber = null;
private String mobile = null;
private String address = null;
private String zipcode = null;

  @Override
  public String toString() {
    return "User{" +
        "id=" + id +
        ", username='" + username + '\'' +
        ", password='" + password + '\'' +
        ", identitynumber='" + identitynumber + '\'' +
        ", mobile='" + mobile + '\'' +
        ", address='" + address + '\'' +
        ", zipcode='" + zipcode + '\'' +
        '}';
  }

  public User(){};

  public User(Integer id, String username, String password, String identitynumber,
      String mobile, String address, String zipcode) {
    this.id = id;
    this.username = username;
    this.password = password;
    this.identitynumber = identitynumber;
    this.mobile = mobile;
    this.address = address;
    this.zipcode = zipcode;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getIdentitynumber() {
    return identitynumber;
  }

  public void setIdentitynumber(String identitynumber) {
    this.identitynumber = identitynumber;
  }

  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getZipcode() {
    return zipcode;
  }

  public void setZipcode(String zipcode) {
    this.zipcode = zipcode;
  }
}
