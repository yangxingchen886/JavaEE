package club.banyuan.controller;

import club.banyuan.entity.User;
import club.banyuan.service.UserService;
import club.banyuan.service.impl.UserServiceImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "RegServlet", urlPatterns = "/reg.do")
public class RegServlet extends HttpServlet {

  protected void doPost(HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {
    String userName = request.getParameter("userName");
    String passWord = request.getParameter("passWord");
    String identityNumber = request.getParameter("identityNumber");
    String mobile = request.getParameter("mobile");
    String address = request.getParameter("address");
    String zipcode = request.getParameter("zipcode");
    UserService userService = new UserServiceImpl();
    Boolean flag = null;
    PrintWriter writer = response.getWriter();
    try {
      flag = userService.add(userName,passWord,identityNumber,mobile,address,zipcode);
      if (flag != false){
        writer.println("<script>alert('success'); window.location='index.jsp'</script>");
      }
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }
    writer.flush();
    writer.close();
  }

  protected void doGet(HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {
    doPost(request, response);
  }
}
