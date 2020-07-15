import club.banyuan.dao.ICommodityDao;
import club.banyuan.entity.Commodity;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCommodity {

  private InputStream in;
  private SqlSession session;

  @Before
  public void before() throws IOException {
    in = Resources.getResourceAsStream("SqlMapConfig.xml");
    SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
    SqlSessionFactory factory = builder.build(in);
    session = factory.openSession();
  }

  @Test
  public void TestGetAll() {
    ICommodityDao commodityDao = session.getMapper(ICommodityDao.class);
    List<Commodity> commodityList = commodityDao.getCommodityList();
    for (Commodity commodity : commodityList) {
      System.out.println(commodity);
    }
  }

  @Test
  public void TestGetComById() {
    ICommodityDao commodityDao = session.getMapper(ICommodityDao.class);
    Commodity commodity = commodityDao.getRecordCom(1);
    System.out.println(commodity.toString());
  }

  @After
  public void after() throws IOException {
    session.close();
    in.close();
  }
}
