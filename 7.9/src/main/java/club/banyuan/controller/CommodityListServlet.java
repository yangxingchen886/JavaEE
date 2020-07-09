package club.banyuan.controller;

import club.banyuan.entity.Commodity;
import club.banyuan.service.CommodityService;
import club.banyuan.service.impl.CommodityServiceImpl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "CommodityListServlet")
public class CommodityListServlet extends HttpServlet {

  protected void doPost(HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {
    List<Commodity> commodityList = new ArrayList<>();
    CommodityService commodityService = new CommodityServiceImpl();
    HttpSession session = request.getSession();
    try {
      commodityList = commodityService.selectList();
      for(Commodity commodity:commodityList){
        System.out.println(commodity);
      }
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
