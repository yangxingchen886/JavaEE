package club.banyuan.controller;

import club.banyuan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
@Autowired
  private UserService userService;

@RequestMapping("/year")
  public String getCurrentYear(){
  return userService.getCurrentYear();
}

@RequestMapping("/birthyear")
  public String getBirthYearByAge(@RequestParam("age") int age){
  return userService.getBirthYearByAge(age);
}
}
