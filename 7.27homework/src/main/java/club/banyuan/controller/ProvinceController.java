package club.banyuan.controller;

import club.banyuan.entity.Province;
import club.banyuan.service.ProvinceService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProvinceController {

  @Autowired
  private ProvinceService provinceService;

  @RequestMapping("/index")
  @ResponseBody
  public List<Province> getProvinces(Model model) {
    List<Province> provinceList = provinceService.getProvinces();
    model.addAttribute("province", provinceList);
    return provinceList;
  }
}
