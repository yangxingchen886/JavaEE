package club.banyuan.dao;

import club.banyuan.entity.RecordHistory;
import java.sql.SQLException;
import java.util.List;

public interface RecordDao extends IBaseDao{
public List<RecordHistory> getRecord (Integer comId) throws SQLException;
public int bidHistory (RecordHistory recordHistory) throws SQLException;
}
