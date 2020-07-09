package club.banyuan.controller;

import club.banyuan.entity.AdminUser;
import club.banyuan.entity.Commodity;
import club.banyuan.entity.User;
import club.banyuan.service.AdminUserService;
import club.banyuan.service.CommodityService;
import club.banyuan.service.UserService;
import club.banyuan.service.impl.AdminUserServiceImpl;
import club.banyuan.service.impl.CommodityServiceImpl;
import club.banyuan.service.impl.UserServiceImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "AdminLoginServlet", urlPatterns = "/adminLogin.do")
public class AdminLoginServlet extends HttpServlet {

  protected void doPost(HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {
    String adminName = request.getParameter("adminName");
    String passWord = request.getParameter("passWord");
    AdminUserService adminUserService = new AdminUserServiceImpl();
    HttpSession session = request.getSession();
    List<Commodity> commodityList = null;
    try {
      AdminUser adminUser = adminUserService.login(adminName,passWord);
      CommodityService commodityService = new CommodityServiceImpl();
      if (adminUser != null) {
        session.setAttribute("adminUser", adminUser);
        try {
          commodityList = commodityService.selectList();
          session.setAttribute("commodityList",commodityList);
        } catch (Exception e) {
          e.printStackTrace();
        }
        request.getRequestDispatcher("adminmanagement.jsp").forward(request, response);
        return;
      }
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }
    PrintWriter writer = response.getWriter();
    writer.println("<script>alert('登录失败');window.location='adminlogin.jsp'</script>");
    //    request.getRequestDispatcher("adminlogin.jsp").forward(request, response);
    writer.flush();
    writer.close();
  }



  protected void doGet(HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {
    doPost(request, response);
  }
}
