package club.banyuan.dao;

import club.banyuan.entity.AdminUser;

public interface IAdminUserDao {
  public AdminUser getAdminLogin(String adminName,String passWord);

}
