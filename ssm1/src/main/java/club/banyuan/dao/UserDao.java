package club.banyuan.dao;

import club.banyuan.entity.User;

import java.util.List;

public interface UserDao {
    public List<User> getAll();
    public User getLoginUser(String userName, String passWord);
    int add(User user);
}
