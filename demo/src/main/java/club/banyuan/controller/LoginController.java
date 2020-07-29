package club.banyuan.controller;

import club.banyuan.entity.Commodity;
import club.banyuan.entity.User;
import club.banyuan.service.CommodityService;
import club.banyuan.service.UserService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

  @Autowired
  private UserService userService;
  @Autowired
  private CommodityService commodityService;
  @RequestMapping("/login")
  public String userLogin(String userName,String passWord, HttpSession session, HttpServletRequest request) {
    User user = userService.getLoginUser(userName, passWord);
    if (user!=null){
      List<Commodity> commodityList = commodityService.getCommodityList();
      request.setAttribute("commodityList",commodityList);
    }
    session.setAttribute("user", user);
    return "auctionlist";
  }
}
