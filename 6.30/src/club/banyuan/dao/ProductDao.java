package club.banyuan.dao;

import club.banyuan.entity.Product;
import club.banyuan.entity.User;

public interface ProductDao extends IBaseDao{
  public void search (String name);

  public Object placeorder(User id,User loginName);
}
