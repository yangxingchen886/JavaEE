package club.banyuan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class demo {

  public static void main(String[] args) {
    Connection conn = null;
    Statement sta = null;
    try {
      conn = DriverManager
          .getConnection("jdbc:mysql://localhost:3306/db1?&useSSL=false&serverTimezone=UTC", "root",
              "yxc.9894");
      sta = conn.createStatement();
      String sql = "create table dept(\n" +
          "\tid int primary key auto_increment,\n" +
          "    dept_name varchar(20) not null,\n" +
          "    dept_location varchar(20) not null\n" +
          ");";
      sta.executeUpdate(sql);
      System.out.println("创建表成功");
    } catch (SQLException e) {
      e.printStackTrace();
    }finally {
      if(sta!=null) {
        try {
          sta.close();
        } catch (SQLException throwables) {
          throwables.printStackTrace();
        }
      }
      if(conn!=null) {
        try {
          conn.close();
        } catch (SQLException throwables) {
          throwables.printStackTrace();
        }
      }
    }
  }
}
