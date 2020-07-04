package club.banyuan.dao.impl;

import club.banyuan.dao.OrderDetialDao;
import club.banyuan.entity.OrderDetial;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class OrderDetialDaoImpl extends BaseDaoImpl implements OrderDetialDao {

  public OrderDetialDaoImpl(Connection connection) {
    super(connection);
  }


  @Override
  public List<Object> getDetiallist(Integer userId) {
    String sql = "select * from `order` where userId = ? ";
    List<Object> paramsList = new ArrayList<>();
    List<Object> orderDetialList = new ArrayList<>();
    paramsList.add(userId);
    System.out.println(userId);
    ResultSet rs =null;
    try {
      rs = executeQuery(sql.toString(), paramsList.toArray());
      while (rs.next()) {
        Object orderDetial = this.tableToClass(rs);
        orderDetialList.add(orderDetial);
      }
    }catch (Exception e){
      e.printStackTrace();
    }finally {
      this.closeResource(rs);
      this.closeResource();
    }
    return orderDetialList;
  }

  @Override
  public Object tableToClass(ResultSet rs) throws Exception {
    OrderDetial orderDetial = new OrderDetial();
    orderDetial.setId(rs.getInt("id"));
    orderDetial.setUserId(rs.getInt("userId"));
    orderDetial.setCreateTime(rs.getString("createTime"));
    orderDetial.setCost(rs.getDouble("cost"));
    orderDetial.setLoginName(rs.getString("loginName"));
    orderDetial.setSerialNumber(rs.getString("serialNumber"));
    return orderDetial;
  }
}
