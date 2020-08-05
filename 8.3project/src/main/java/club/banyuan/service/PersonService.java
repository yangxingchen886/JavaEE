package club.banyuan.service;

import club.banyuan.dto.Person;
import java.util.List;

public interface PersonService {

  public int total();

  public Person getById(Integer id);

  public List<Person> getAll();

  public boolean insert(Person person);

  public boolean updateById(Person person);

  public boolean deleteById(Integer id);
}
