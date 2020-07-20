package club.banyuan.controller;

import club.banyuan.entity.User;
import club.banyuan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

//    @RequestMapping("/allUser")
//    public String getAll(HttpServletRequest request){
//    public String getAll(Model model){
//        List<User> userList = userService.getAll();
//        model.addAttribute("userList",userList);
//        request.setAttribute("userList",userList);
//        return "list";
//    }

}
