package club.banyuan.service.impl;

import club.banyuan.dao.CommodityDao;
import club.banyuan.entity.Commodity;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommodityService implements club.banyuan.service.CommodityService {
@Autowired
private CommodityDao commodityDao;

  public List<Commodity> getCommodityList() {
    List<Commodity> commodityList = commodityDao.getCommodityList();
    return commodityList;
  }

  public Commodity getRecordCom(Integer commodityId) {
    Commodity commodity = commodityDao.getRecordCom(commodityId);
    return commodity;
  }
}
