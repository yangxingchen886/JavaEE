package club.banyuan.controller;

import club.banyuan.dao.UserDao;
import club.banyuan.dao.impl.UserDaoImpl;
import club.banyuan.entity.User;
import club.banyuan.util.JdbcUtils;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RegistServlet", urlPatterns = "/regist.do")
public class RegistServlet extends HttpServlet {

  protected void doPost(HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {

    String loginName = request.getParameter("loginName");
    String userName = request.getParameter("userName");
    String password = request.getParameter("password");
    Integer sex =Integer.valueOf( request.getParameter("sex"));
    String email = request.getParameter("email");
    User user = new User(null,loginName,userName,password,sex,email,null);
    boolean flag = false;
    try {
      UserDao userDao = new UserDaoImpl(JdbcUtils.getConnection());
      int id = userDao.add(user);
      if (id>0){
        flag = true;
      }
      PrintWriter printWriter = response.getWriter();
      if (flag = true){
        printWriter.print("<script>alert('success'); window.location='index.jsp'</script>");
        printWriter.flush();
        printWriter.close();
      }else{
        printWriter.print("<script>alert('faild');window.location='index.jsp'</script>");
        printWriter.flush();
        printWriter.close();
      }

    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }
//    request.getRequestDispatcher("/index.jsp").forward(request,response);
  }


  protected void doGet(HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {
    doPost(request, response);
  }
}
