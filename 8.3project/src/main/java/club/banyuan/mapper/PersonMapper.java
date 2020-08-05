package club.banyuan.mapper;


import club.banyuan.entity.PersonEntity;
import java.util.List;

public interface PersonMapper {

  public int total();

  public PersonEntity getById(Integer id);

  public List<PersonEntity> getAll();

  public int insert(PersonEntity personEntity);

  public int updateById(PersonEntity personEntity);

  public int deleteById(Integer id);
}
