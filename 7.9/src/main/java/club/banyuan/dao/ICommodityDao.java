package club.banyuan.dao;

import club.banyuan.entity.Commodity;
import java.util.List;

public interface ICommodityDao {
  public List<Commodity> getCommodityList ();
  public Commodity getRecordCom(Integer commodityId);
}
