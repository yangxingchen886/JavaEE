package club.banyuan.service.impl;

import club.banyuan.dao.CommodityDao;
import club.banyuan.dao.impl.CommodityDaoImpl;
import club.banyuan.entity.Commodity;
import club.banyuan.service.CommodityService;
import club.banyuan.util.JdbcUtils;
import java.util.ArrayList;
import java.util.List;

public class CommodityServiceImpl implements CommodityService {

  @Override
  public List<Commodity> selectList() throws Exception {
    CommodityDao commodityDao = new CommodityDaoImpl(JdbcUtils.getConnection());
    List<Commodity> getCommodityList = commodityDao.getCommodityList();
    return getCommodityList;
  }
}
