package club.banyuan.controller;

import club.banyuan.entity.Commodity;
import club.banyuan.entity.RecordHistory;
import club.banyuan.service.CommodityService;
import club.banyuan.service.RecordHisService;
import club.banyuan.service.impl.CommodityServiceImpl;
import club.banyuan.service.impl.RecordHisServiceImpl;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "RecordServlet", urlPatterns = "/record.do")
public class RecordServlet extends HttpServlet {

  protected void doPost(HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {
    Integer comId = Integer.valueOf(request.getParameter("commodityId"));
    List<RecordHistory> recordHistoryList = null;
    CommodityService commodityService = new CommodityServiceImpl();
    RecordHisService recordHisService = new RecordHisServiceImpl();
    try {
      Commodity commodity = commodityService.getRecordCom(comId);
      request.setAttribute("commodity", commodity);
      recordHistoryList = recordHisService.getRecordHis(comId);
      request.setAttribute("recordHistoryList",recordHistoryList);
      request.getRequestDispatcher("auctionrecord.jsp").forward(request,response);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  protected void doGet(HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {
    doPost(request, response);
  }
}
