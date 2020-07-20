package club.banyuan.entity;
public class AdminUser {
private Integer id = null;
private String adminName = null;
private String password = null;

  public AdminUser(){}

  public AdminUser(Integer id, String adminName, String password) {
    this.id = id;
    this.adminName = adminName;
    this.password = password;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getAdminName() {
    return adminName;
  }

  public void setAdminName(String adminName) {
    this.adminName = adminName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
