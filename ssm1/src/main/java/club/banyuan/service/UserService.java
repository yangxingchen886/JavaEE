package club.banyuan.service;

import club.banyuan.entity.User;

import java.util.List;

public interface UserService {

  public User getLoginUser(String userName, String passWord);

  public int add(User user);

}
