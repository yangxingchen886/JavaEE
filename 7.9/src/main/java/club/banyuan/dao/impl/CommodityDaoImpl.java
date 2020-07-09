package club.banyuan.dao.impl;

import club.banyuan.dao.CommodityDao;
import club.banyuan.entity.Commodity;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CommodityDaoImpl extends BaseDaoImpl implements CommodityDao {

  public CommodityDaoImpl(Connection connection) {
    super(connection);
  }

  @Override
  public List<Commodity> getCommodityList() throws SQLException {
    List<Commodity> commodityList = new ArrayList<>();
//      String sql = "select * from commodity";
    PreparedStatement pstm = connection.prepareStatement("select * from commodity");
//      ResultSet rs = executeQuery(sql,null);
    ResultSet rs = pstm.executeQuery();
    while (rs.next()) {
      Commodity commodity = null;
      try {
        commodity = this.tableToClass(rs);
        commodityList.add(commodity);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    return commodityList;
  }

  @Override
  public Commodity tableToClass(ResultSet rs) throws Exception {
    Commodity commodity = new Commodity(rs.getInt("id"),
        rs.getString("commodityname"), rs.getFloat("initialprice"),
        rs.getFloat("initialprice"),
        rs.getString("starttime"),
        rs.getString("endtime"),
        rs.getString("describe"));

    return commodity;
  }
}
