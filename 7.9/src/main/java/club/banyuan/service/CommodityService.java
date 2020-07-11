package club.banyuan.service;

import club.banyuan.entity.Commodity;
import java.util.List;

public interface CommodityService {
  public List<Commodity> selectList() throws Exception;
  public Commodity getRecordCom(Integer commodityId) throws Exception;
}
