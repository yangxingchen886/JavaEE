package club.banyuan.service.impl;

import club.banyuan.entity.Province;
import club.banyuan.mapper.ProvinceMapper;
import club.banyuan.service.ProvinceService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ProvinceService")
public class ProvinceServiceImpl implements ProvinceService {
  @Autowired
  private ProvinceMapper provinceMapper;

  @Override
  public List<Province> getProvinces() {
    return provinceMapper.getProvinces();
  }
}
