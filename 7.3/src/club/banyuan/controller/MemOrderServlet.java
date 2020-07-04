package club.banyuan.controller;

import club.banyuan.entity.OrderDetial;
import club.banyuan.service.OrderDetialService;
import club.banyuan.service.impl.OrderDetialServiceImpl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "MemOrderServlet", urlPatterns = "/memOrder.do")
public class MemOrderServlet extends HttpServlet {

  protected void doPost(HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {
    Integer usrId = Integer.valueOf(request.getParameter("userId"));
    List<Object> orderDetialList = new ArrayList<>();
    OrderDetialService orderDetialService = new OrderDetialServiceImpl();
    try {
      orderDetialList = orderDetialService.getDetiallist(usrId);
      for (Object orderDetial:orderDetialList){
        System.out.println(orderDetial.toString());
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    HttpSession httpSession = request.getSession();
    httpSession.setAttribute("orderDetialList",orderDetialList);
    request.getRequestDispatcher("member_order.jsp").forward(request,response);
  }

  protected void doGet(HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {
    doPost(request, response);
  }
}
