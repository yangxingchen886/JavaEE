package club.banyuan.homework;

import club.banyuan.JdbcUtils;
import java.net.ConnectException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;


public class homework {
  public static Map<Products,Integer> map=null;
  static {
    map = new HashMap<Products,Integer>();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入用户名：");
    String name = sc.nextLine();
    System.out.println("请输入密码：");
    String password = sc.nextLine();
    try {
      loginShop(name, password);
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }
    System.out.println("请输入要查询的商品名称：");
    String product = sc.nextLine();
    try {
      search(product);
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }
  }
  public static void search(String product) throws SQLException {
    Connection conn = JdbcUtils.getConnection("shoppingstreet");
    ResultSet rs = null;
    String sql = "select DISTINCT product.id,product.name,product.description,product.price,product.stock,order_detail.quantity from product,order_detail where name like ? or description like ?";
    PreparedStatement ps = conn.prepareStatement(sql);
    ps.setString(1,"%"+product+"%");
    ps.setString(2,"%"+product+"%");
    rs = ps.executeQuery();

    while (rs.next()){
      Products products = new Products();
      products.setId(rs.getInt("id"));
      products.setName(rs.getString("name"));
      products.setDescription(rs.getString("description"));
      products.setPrice(rs.getFloat("price"));
      products.setStock(rs.getInt("stock"));
      products.setQuantity(rs.getInt("quantity"));
      map.put(products,products.getQuantity());
    }
    JdbcUtils.close(conn,ps,rs);
    for(Entry<Products,Integer> s : map.entrySet()){
      System.out.println(s.getKey());
      System.out.println(s.getValue());
    }
  }

  public static void loginShop(String name, String password) throws SQLException {
    Connection conn = JdbcUtils.getConnection("shoppingstreet");
    ResultSet rs = null;
    String sql = "select * from user where loginname = ? and password = ?";
    PreparedStatement ps = conn.prepareStatement(sql);
    ps.setString(1, name);
    ps.setString(2, password);
    rs = ps.executeQuery();
    if (rs.next()) {
      System.out.println("登陆成功:" + name);
    } else {
      System.out.println("登陆失败");
    }
    JdbcUtils.close(conn, ps, rs);
  }


}
