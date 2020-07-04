package club.banyuan.service.impl;

import club.banyuan.dao.OrderDetialDao;
import club.banyuan.dao.impl.OrderDetialDaoImpl;
import club.banyuan.service.OrderDetialService;
import club.banyuan.util.JdbcUtils;
import java.util.List;

public class OrderDetialServiceImpl implements OrderDetialService {

  @Override
  public List<Object> getDetiallist(Integer usrId) throws Exception {
    OrderDetialDao orderDetialDao = new OrderDetialDaoImpl(JdbcUtils.getConnection());
    List<Object> orderDetialList = orderDetialDao.getDetiallist(usrId);
    return orderDetialList;
  }
}
