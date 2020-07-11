package club.banyuan.dao.impl;

import club.banyuan.dao.RecordDao;
import club.banyuan.entity.Commodity;
import club.banyuan.entity.RecordHistory;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RecordDaoImpl extends BaseDaoImpl implements RecordDao {

  public RecordDaoImpl(Connection connection) {
    super(connection);
  }

  @Override
  public List<RecordHistory> getRecord(Integer comId) throws SQLException {
    String sql = "select * from auctionRecord where auctionComId = ?";
    ResultSet rs = executeQuery(sql, new Object[]{comId});
    List<RecordHistory> recordHistoryList = new ArrayList<>();

    while (rs.next()) {
      RecordHistory recordHistory = null;
      try {
        recordHistory = this.tableToClass(rs);
        recordHistoryList.add(recordHistory);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    return recordHistoryList;
  }

  @Override
  public int bidHistory(RecordHistory recordHistory) throws SQLException {
    String sql = "INSERT INTO auctionRecord VALUES (NULL,?,?,?,?);";
    Object[] params = {recordHistory.getAuctionTime(), recordHistory.getAuctionPrice(),
        recordHistory.getUserId(), recordHistory.getComId()};
    Integer i = executeInsert(sql,params);
    return i;
  }

  @Override
  public RecordHistory tableToClass(ResultSet rs) throws Exception {
    RecordHistory recordHistory = new RecordHistory(rs.getInt("id"),
        rs.getString("auctionTime"),
        rs.getFloat("auctionPrice"),
        rs.getInt("auctionUsrId"),
        rs.getInt("auctionComId"));
    return recordHistory;
  }
}
