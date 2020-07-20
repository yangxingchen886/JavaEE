package club.banyuan.dao;

import club.banyuan.entity.Commodity;
import java.util.List;

public interface CommodityDao {
  public List<Commodity> getCommodityList ();
  public Commodity getRecordCom(Integer commodityId);
}
