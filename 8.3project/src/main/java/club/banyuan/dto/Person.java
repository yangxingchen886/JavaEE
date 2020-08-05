package club.banyuan.dto;

import javax.validation.constraints.NotBlank;

public class Person {
private Integer id;

@NotBlank(message = "姓名不能为空")
private String name;
private Integer age;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }
}
