package club.banyuan.service.impl;

import club.banyuan.dao.AdminUserDao;
import club.banyuan.dao.impl.AdminUserDaoImpl;
import club.banyuan.entity.AdminUser;
import club.banyuan.service.AdminUserService;
import club.banyuan.util.JdbcUtils;
import java.sql.SQLException;

public class AdminUserServiceImpl implements AdminUserService {

  @Override
  public AdminUser login(String adminName, String passWord) throws SQLException {
    AdminUserDao adminUserDao =new AdminUserDaoImpl(JdbcUtils.getConnection());
    return adminUserDao.getAdminLogin(adminName,passWord);
  }
}
