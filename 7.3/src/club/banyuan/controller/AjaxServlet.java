package club.banyuan.controller;

import club.banyuan.dao.UserDao;
import club.banyuan.dao.impl.UserDaoImpl;
import club.banyuan.util.JdbcUtils;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "AjaxServlet",urlPatterns = "/ajaxLoginName.do")
public class AjaxServlet extends HttpServlet {

  protected void doPost(HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {
    PrintWriter out = response.getWriter();
    String loginName = request.getParameter("loginName");
    try {
      UserDao userDao = new UserDaoImpl(JdbcUtils.getConnection());
      Boolean flag = userDao.findUserByLoginname(loginName);
      if (flag){
        out.println("<script>alert('success')</script>");
      }else {
        out.println(1);
      }
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }
  }

  protected void doGet(HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {
doPost(request,response);
  }
}
