package club.banyuan.dao;

import club.banyuan.entity.Commodity;
import java.sql.SQLException;
import java.util.List;

public interface CommodityDao extends IBaseDao{
public List<Commodity> getCommodityList () throws SQLException;
}
