import club.banyuan.dao.UserDao;
import club.banyuan.entity.User;
import java.io.IOException;
import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestUser {

  private InputStream in;
  private SqlSession session;

  @Before
  public void before() throws IOException {
    in = Resources.getResourceAsStream("applicationContext-dao.xml");
    SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
    SqlSessionFactory factory = builder.build(in);
    session = factory.openSession();
  }
  @Test
  public void testLogin() {
    UserDao iUserDao = session.getMapper(UserDao.class);
    User user = iUserDao.getLoginUser("aaa", "123");
    System.out.println(user.toString());

  }

  @After
  public void after() throws IOException {
    session.close();
    in.close();
  }

}
