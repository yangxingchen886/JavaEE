package club.banyuan.dao.impl;

import club.banyuan.dao.AdminUserDao;
import club.banyuan.entity.AdminUser;
import java.sql.Connection;
import java.sql.ResultSet;

public class AdminUserDaoImpl extends BaseDaoImpl implements AdminUserDao {

  public AdminUserDaoImpl(Connection connection) {
    super(connection);
  }

  @Override
  public AdminUser getAdminLogin(String adminName, String passWord) {
    String sql = "select * from `adminuser` where adminname=? and password=?";
    ResultSet rs = executeQuery(sql, new Object[]{adminName,passWord});
    AdminUser adminUser = null;
    try {
      if (rs.next()){
        adminUser=tableToClass(rs);
      }
    } catch (Exception exception) {
      exception.printStackTrace();
    }
    return adminUser;
  }

  @Override
  public AdminUser tableToClass(ResultSet rs) throws Exception {
    AdminUser adminUser = new AdminUser(rs.getInt("id"),rs.getString("adminname"),rs.getString("password"));
    return adminUser;
  }
}
