import club.banyuan.dao.ProductDao;
import club.banyuan.dao.UserDao;
import club.banyuan.dao.impl.ProductDaoImpl;
import club.banyuan.dao.impl.UserDaoImpl;
import club.banyuan.entity.Product;
import club.banyuan.entity.User;
import club.banyuan.util.JdbcUtils;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

//一、准备工作
//1、导入jdbc的jar
//2、复制util/jdbcUtil，dao/IBaseDao、dao/impl/BaseDaoImpl到各自包下
//3、复制配置文件db.properties到src目录
//二、自定义dao
//1、在dao包下创建自定义接口（继承通用BaseDao接口）
//2、在dao/impl下创建自定义接口的实现类
//        以及继承通用接口的实现类BaseDaoImpl
//3、实现自定义接口中的方法


public class TestMain {

  public static void main(String[] args) throws IOException, SQLException {
    Connection conn = JdbcUtils.getConnection();
    UserDao userDao = new UserDaoImpl(conn);
    ProductDao productDao = new ProductDaoImpl(conn);
//        User newUser = new User(null,"kkkk","realName","123",1,"dfs@sdf.com","12345666673");
//        int id = userDao.add(newUser);
//        System.out.println(id);
    Scanner scanner = new Scanner(System.in);
    System.out.println("请输入用户名：");
    String lName = scanner.nextLine();
    System.out.println("请输入密码：");
    String lpassword = scanner.nextLine();
    User loginuser = userDao.getLoginUser(lName, lpassword);
    if (loginuser!=null) {
      System.out.println("登陆成功：" + loginuser.getUserName());
      System.out.println("请输入要搜索的商品名称：");
      String proName = scanner.nextLine();
      productDao.search(proName);

    }else{
      System.out.println("用户名或密码错误，登录失败");
    }

  }
}
