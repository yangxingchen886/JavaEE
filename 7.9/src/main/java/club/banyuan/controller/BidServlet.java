package club.banyuan.controller;

import club.banyuan.entity.RecordHistory;
import club.banyuan.service.RecordHisService;
import club.banyuan.service.impl.RecordHisServiceImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "BidServlet", urlPatterns = "/bid.do")
public class BidServlet extends HttpServlet {

  protected void doPost(HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {
    Float auctionPrice = Float.valueOf(request.getParameter("auctionPrice"));
    Integer userId = Integer.valueOf(request.getParameter("userId"));
    Integer comId = Integer.valueOf(request.getParameter("comId"));
    Date date = new Date();
    String auctionTime = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(date);
    RecordHistory recordHistory = new RecordHistory(null, auctionTime, auctionPrice, userId, comId);
    RecordHisService recordHisService = new RecordHisServiceImpl();
    PrintWriter writer = response.getWriter();
    Boolean flag;
    try {
      flag = recordHisService.bidHistory(recordHistory);
      if (flag == true) {
        writer.println("<script>alert('success'); window.location='auctionlist.jsp'</script>");
      } else {
        writer.println("<script>alert('failed'); window.location='auctionlist.jsp'</script>");
      }

    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }
  }

  protected void doGet(HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {
    doPost(request, response);
  }
}
