package club.banyuan;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        //从控制台上输入的用户名和密码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String name = sc.nextLine();
        System.out.println("请输入密码：");
        String password = sc.nextLine();
        try {
            validate(name, password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void validate(String name,String password) throws SQLException {
        Connection conn = JdbcUtils.getConnection(null);
        Statement stmt = conn.createStatement();
        String sql = " select * from user where name='"+name
                +"' and password='"+password+"'";
        ResultSet rs = stmt.executeQuery(sql);
        if(rs.next()){
            System.out.println("success");
        }else{
            System.out.println("faile");
        }
    }
}
