import club.banyuan.dao.IRecordDao;
import club.banyuan.entity.RecordHistory;
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

public class TestRecord {

  private InputStream in;
  private SqlSession session;

  @Before
  public void before() throws IOException {
    in = Resources.getResourceAsStream("SqlMapConfig.xml");
    SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
    SqlSessionFactory factory = builder.build(in);
    session=factory.openSession();
  }

  @Test
  public void TestRecord(){
    IRecordDao iRecordDao = session.getMapper(IRecordDao.class);
    List<RecordHistory> recordHistoryList = iRecordDao.getRecord(1);
    for (RecordHistory recordHistory : recordHistoryList) {
      System.out.println(recordHistory);
    }
  }
  @Test
      public void TestAddRecord(){
    IRecordDao iRecordDao = session.getMapper(IRecordDao.class);
    RecordHistory recordHistory = new RecordHistory(null,"2020-07-15 20:00:00",4214.02f,1,1);
    Integer integer = iRecordDao.bidHistory(recordHistory);
    System.out.println(integer);
  }

  @After
  public void after() throws IOException {
    session.close();
    in.close();
  }
}
