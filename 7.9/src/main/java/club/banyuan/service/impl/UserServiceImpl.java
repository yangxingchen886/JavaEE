package club.banyuan.service.impl;

import club.banyuan.dao.IUserDao;
import club.banyuan.dao.UserDao;
import club.banyuan.dao.impl.UserDaoImpl;
import club.banyuan.entity.User;
import club.banyuan.service.UserService;
import club.banyuan.util.JdbcUtils;

import java.sql.SQLException;

public class UserServiceImpl implements UserService {
    @Override
    public User login(String username, String password) throws SQLException {
        UserDao userDao = new UserDaoImpl(JdbcUtils.getConnection());
        return userDao.getLoginUser(username,password);
    }

    @Override
    public Boolean add(String username, String password, String identitynumber,
        String mobile, String address, String zipcode) throws SQLException {
        UserDao userDao = new UserDaoImpl(JdbcUtils.getConnection());
        User user = new User(null,username,password,identitynumber,mobile,address,zipcode);
        int id = userDao.add(user);
        Boolean flag = false;
        if (id>0){
            flag = true;
        }
        return flag;
    }
}
