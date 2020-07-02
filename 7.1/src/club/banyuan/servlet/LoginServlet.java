package club.banyuan.servlet;

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

@WebServlet(name = "LoginServlet", urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {

  protected void doPost(HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {
    doGet(request, response);
  }

  protected void doGet(HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {
    try {
      UserDao userDao = new UserDaoImpl(JdbcUtils.getConnection());
      User user = userDao
          .getLoginUser(request.getParameter("loginName"), request.getParameter("password"));
      //PrintWriter printWriter = response.getWriter();
      Boolean flag = false;
      //response.setCharacterEncoding("utf-8");
      if (user != null) {
        flag = true;
      }
      String loginname = request.getParameter("username");
      if ("".equals(loginname.trim()) || loginname == null) {
        request.setAttribute("error", "用户名不能为空");
      } else {

      }
        request.getRequestDispatcher("Success.jsp").forward(request, response);
//      if (flag){
//        response.sendRedirect("loginSuccess.html");
//      }else{
//        response.sendRedirect("loginfaile.html");
//      }

//      printWriter.println("<html>");
//      printWriter.println("<meta charset='utf-8'/>");
//      printWriter.println("<body>"); if (user != null) {
//        printWriter.println("登陆成功：" + user.getUserName());
//      } else {
//        printWriter.println("登录失败");
//      }
//      printWriter.println("</body>");
//      printWriter.println("</html>");
//      printWriter.flush();
//      printWriter.close();

    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }

  }
}
