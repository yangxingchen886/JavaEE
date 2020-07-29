package club.banyuan.controller;

import club.banyuan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

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
