package club.banyuan.controller;

import club.banyuan.dto.Person;
import club.banyuan.dto.Result;
import club.banyuan.service.PersonService;
import club.banyuan.utils.ResultUtil;
import java.util.List;
import javax.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")

public class PersonController {

  private static final Logger log = LoggerFactory.getLogger(PersonController.class);

  @Autowired
  private PersonService personService;

  @GetMapping("/total")
  public Result<?> total() {
    log.debug("this is debug message");
    log.info("this is info message");
    log.warn("this is warn message");
    log.error("this is error message");
    String data = "Person表记录数为：" + personService.total();
    return ResultUtil.success(data);
  }

  @GetMapping("/get")
  public Result<?> getPersonById(@RequestParam("id") Integer id) {
    return ResultUtil.success(personService.getById(id));
  }

  @GetMapping("/all")
  public Result<?> getAll() {
    List<Person> personList = personService.getAll();
    return ResultUtil.success(personList);
  }

  @PostMapping("/add")
  public Result<?> add(@RequestBody @Valid Person person) {
    personService.insert(person);
    return ResultUtil.success();
  }

  @PostMapping("/update")
  public Result<?> update(@RequestBody Person person) {
    if (person.getId() == null){
      return ResultUtil.error(10,"id不能为空");
    }
    boolean result = personService.updateById(person);
    if (!result){
      return ResultUtil.error(20,"该用户不存在");
    }
    return ResultUtil.success();
  }

  @PostMapping("/delete")
  public Result<?> delete(@RequestParam("id") Integer id) {
    boolean result = personService.deleteById(id);
    if (!result){
      return ResultUtil.error(20,"该用户不存在");
    }
    return ResultUtil.success();
  }
}
