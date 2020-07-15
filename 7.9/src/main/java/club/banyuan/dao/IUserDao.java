package club.banyuan.dao;

import club.banyuan.entity.User;
import java.util.List;

public interface IUserDao {
  int add(User user);
  User getLoginUser(String userName, String passWord);
}
