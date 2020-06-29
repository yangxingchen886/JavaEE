package club.banyuan;

import java.sql.*;
import java.util.Date;

public class Jdbc4 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conn = JdbcUtils.getConnection(null);
            stmt = conn.createStatement();

            rs = stmt.executeQuery("select * from dept");
            while(rs.next()){
                int id = rs.getInt(1);
                String deptName = rs.getString(2);
                String location = rs.getString(3);
                Date setupDate = rs.getDate(4);

                System.out.println("id:"+id+"\t deptName:"+deptName
                        +"\tlocation:"+location+"\tsetupDate="+setupDate);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            try {
                JdbcUtils.close(conn,stmt,rs);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
