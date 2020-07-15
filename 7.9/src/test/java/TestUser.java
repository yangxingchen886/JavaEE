import club.banyuan.dao.IUserDao;
import club.banyuan.entity.User;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class TestUser {

  public static void main(String[] args) throws IOException {
    InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
    SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
    SqlSessionFactory factory = builder.build(in);
    SqlSession session = factory.openSession();
    IUserDao iUserDao = session.getMapper(IUserDao.class);
    List<User> userList = iUserDao.getAll();
    for (User user : userList) {
      System.out.println(user);
    }
    session.close();
    in.close();
  }
}
