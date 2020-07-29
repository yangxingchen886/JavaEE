package club.banyuan.mapper;

import club.banyuan.entity.Province;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface ProvinceMapper {
  List<Province> getProvinces();
}
