package club.banyuan.service.impl;

import club.banyuan.dao.UserDao;
import club.banyuan.entity.User;
import club.banyuan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserDao userDao;

  public User getLoginUser(String userName, String passWord) {
    User user = userDao.getLoginUser(userName,passWord);
    return user;
  }

  public int add(User user) {
    Integer count = 0;
    count = userDao.add(user);
    return count;
  }
}
