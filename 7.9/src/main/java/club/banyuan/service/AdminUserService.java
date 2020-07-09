package club.banyuan.service;

import club.banyuan.entity.AdminUser;
import java.sql.SQLException;

public interface AdminUserService {
public AdminUser login (String adminName,String passWord) throws SQLException;
}
