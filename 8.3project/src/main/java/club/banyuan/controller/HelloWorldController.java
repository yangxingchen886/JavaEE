package club.banyuan.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorldController {
  @RequestMapping("/")
  public String index(){
    return "HELLO WORLD!";
  }

}
