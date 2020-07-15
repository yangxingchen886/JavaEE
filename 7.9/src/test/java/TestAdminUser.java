import club.banyuan.dao.IAdminUserDao;
import club.banyuan.entity.AdminUser;
import java.io.IOException;
import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestAdminUser {

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
  public void TestLogin() {
    IAdminUserDao iAdminUserDao = session.getMapper(IAdminUserDao.class);
    AdminUser adminUser = iAdminUserDao.getAdminLogin("admin", "admin");
    System.out.println(adminUser.getAdminName());
  }

  @After
  public void after() throws IOException {
    session.close();
    in.close();
  }
}
