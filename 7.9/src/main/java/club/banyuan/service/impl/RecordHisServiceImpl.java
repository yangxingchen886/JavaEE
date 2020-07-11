package club.banyuan.service.impl;

import club.banyuan.dao.RecordDao;
import club.banyuan.dao.impl.RecordDaoImpl;
import club.banyuan.entity.RecordHistory;
import club.banyuan.service.RecordHisService;
import club.banyuan.util.JdbcUtils;
import java.sql.SQLException;
import java.util.List;

public class RecordHisServiceImpl implements RecordHisService {
  RecordDao recordDao;
  @Override
  public List<RecordHistory> getRecordHis(Integer comId) throws SQLException {
    recordDao = new RecordDaoImpl(JdbcUtils.getConnection());
    List<RecordHistory> recordHistoryList = null;
    recordHistoryList = recordDao.getRecord(comId);
    return recordHistoryList;
  }

  @Override
  public Boolean bidHistory(RecordHistory recordHistory) throws SQLException {
    recordDao = new RecordDaoImpl(JdbcUtils.getConnection());
    int i = recordDao.bidHistory(recordHistory);
    Boolean flag = false;
    if (i>0){
      flag = true;
      return flag;
    }
    return flag;
  }
}
