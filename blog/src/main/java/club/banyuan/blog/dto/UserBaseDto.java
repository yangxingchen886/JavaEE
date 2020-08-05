package club.banyuan.blog.dto;

import java.sql.Timestamp;

public class UserBaseDto {
private Long id;
private String username;
  private String password;
  private String nickname;
  private boolean enabled;
  private String email;
  private String userface;
  private Timestamp regTime;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
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

  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(boolean enabled) {
    this.enabled = enabled;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getUserface() {
    return userface;
  }

  public void setUserface(String userface) {
    this.userface = userface;
  }

  public Timestamp getRegTime() {
    return regTime;
  }

  public void setRegTime(Timestamp regTime) {
    this.regTime = regTime;
  }
}
