package club.banyuan.dao;

import club.banyuan.entity.RecordHistory;
import java.util.List;

public interface IRecordDao {
  public List<RecordHistory> getRecord (Integer comId);
  public int bidHistory (RecordHistory recordHistory);
}
