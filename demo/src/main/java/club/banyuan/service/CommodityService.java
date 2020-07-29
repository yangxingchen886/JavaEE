package club.banyuan.service;

import club.banyuan.entity.Commodity;
import java.util.List;

public interface CommodityService {

  public List<Commodity> getCommodityList();

  public Commodity getRecordCom(Integer commodityId);

}
