package club.banyuan.dao.impl;

import club.banyuan.dao.ProductDao;
import club.banyuan.entity.Product;
import club.banyuan.entity.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductDaoImpl extends BaseDaoImpl implements ProductDao {

  protected Connection conn;
  protected PreparedStatement pstm;
  private Date time = new java.sql.Date(new java.util.Date().getTime());

  public ProductDaoImpl(Connection connection) {
    super(connection);
  }
  List<Product> products = new ArrayList<>();
  @Override
  public Product tableToClass(ResultSet rs) throws Exception {
    Product product =new Product();
    product.setId(rs.getInt("id"));
    product.setName(rs.getString("name"));
    product.setDescription(rs.getString("description"));
    product.setPrice(rs.getDouble("price"));
    product.setStock(rs.getInt("stock"));
    products.add(product);
    return product;
  }


  @Override
  public void search(String name) {
    String sql = "SELECT id,name,description,price,stock FROM product WHERE NAME LIKE ? OR description LIKE ?";
    ResultSet rs = this.executeQuery(sql,new String[]{"%"+name+"%","%"+name+"%"});
    Product product = null;
    try {
      while (rs.next()){
        products.add(tableToClass(rs));
        product= tableToClass(rs);
        System.out.println(product.toString());
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Override
  public Object placeorder(User id,User loginName) {
    String sql ="INSERT INTO `order` VALUES (NULL,?,?,'用户地址',"+time+",?,null)";
    return null;
  }

}
