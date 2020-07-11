package club.banyuan.service;

import club.banyuan.entity.RecordHistory;
import java.sql.SQLException;
import java.util.List;

public interface RecordHisService {
public List<RecordHistory> getRecordHis(Integer comId) throws SQLException;
public Boolean bidHistory(RecordHistory recordHistory) throws SQLException;
}
