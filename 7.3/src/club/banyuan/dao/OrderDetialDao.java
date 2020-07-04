package club.banyuan.dao;

import club.banyuan.entity.OrderDetial;
import club.banyuan.entity.Product;
import java.util.List;

public interface OrderDetialDao extends IBaseDao{
public List<Object> getDetiallist(Integer usrId) throws Exception;

}
