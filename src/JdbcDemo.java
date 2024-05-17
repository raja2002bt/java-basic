import java.sql.*;

public class JdbcDemo {
    public static void main(String[] args) throws SQLException {

        String sql ="select br_name  from branch where branch_id='3'";
        String url ="jdbc:mysql://localhost:3306/branch";
        String username ="root";
        String password ="9159608502";


        Connection con = DriverManager.getConnection(url,username,password);
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(sql);
        rs.next();
        String name=rs.getString(1);
        System.out.println(name);
        con.close();
    }
}
