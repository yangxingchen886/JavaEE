package club.banyuan.dao;

import club.banyuan.entity.AdminUser;

public interface AdminUserDao extends IBaseDao{
public AdminUser getAdminLogin(String adminName,String passWord);
}
