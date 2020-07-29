package club.banyuan.dao;

import java.util.List;

public interface CommodityDao {
  public List<Commodity> getCommodityList ();
  public Commodity getRecordCom(Integer commodityId);
}
