package club.banyuan.service;

import club.banyuan.entity.User;

import java.sql.SQLException;

public interface UserService {
    public User login(String username, String password) throws SQLException;
    public Boolean add(String username, String password, String identitynumber,
        String mobile, String address, String zipcode) throws SQLException;
}
