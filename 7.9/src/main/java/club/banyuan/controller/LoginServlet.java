package club.banyuan.controller;

import club.banyuan.entity.Commodity;
import club.banyuan.entity.User;
import club.banyuan.service.CommodityService;
import club.banyuan.service.UserService;
import club.banyuan.service.impl.CommodityServiceImpl;
import club.banyuan.service.impl.UserServiceImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "LoginServlet",urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {

  protected void doPost(HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {
    String userName = request.getParameter("userName");
    String passWord = request.getParameter("passWord");
    UserService userService = new UserServiceImpl();
    HttpSession session = request.getSession();
    List<Commodity> commodityList = null;
    try {
      User user = userService.login(userName,passWord);
      if (user!=null){
        session.setAttribute("user",user);
        CommodityService commodityService = new CommodityServiceImpl();
        try {
          commodityList = commodityService.selectList();
          session.setAttribute("commodityList",commodityList);
          request.getRequestDispatcher("auctionlist.jsp").forward(request,response);
        } catch (Exception e) {
          e.printStackTrace();
        }
        return;
      }
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }
    request.getRequestDispatcher("index.jsp").forward(request,response);
  }

  protected void doGet(HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {
    doPost(request, response);
  }
}
