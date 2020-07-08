package club.banyuan.dao.impl;

import club.banyuan.dao.UserDao;
import club.banyuan.entity.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl extends BaseDaoImpl implements UserDao {

    public UserDaoImpl(Connection conn) {
        super(conn);
    }

    @Override
    public int add(User user) {
        String sql = "insert into user(id,username,password,identitynumber,mobile,address,zipcode) values(null,?,?,?,?,?,?)";
        Object[] params = new Object[]{user.getUsername()
            , user.getPassword(), user.getIdentitynumber()
            , user.getMobile(),user.getAddress(),
            user.getZipcode()};
        int i = executeInsert(sql, params);
        return i;
    }

    @Override
    public User getLoginUser(String userName, String passWord) {
        String sql = "select * from `user` where username=? and password=?";
        System.out.println(userName);
        System.out.println(passWord);
        ResultSet rs = executeQuery(sql, new Object[]{userName, passWord});
        User user = null;
        try {
            System.out.println(rs.getString("username"));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try {
            if (rs.next()) {
                user = tableToClass(rs);
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return user;
    }


    @Override
    public User tableToClass(ResultSet rs) throws Exception {
        User user = new User(rs.getInt("id"),
            rs.getString("username"),
                rs.getString("password"),
                rs.getString("identitynumber"),
                rs.getString("mobile"),
                rs.getString("address"),
                rs.getString("zipcode"));

        return user;
    }
}
