import java.sql.*;
import java.util.Scanner;

public class JdbcDemo {
    public static void main(String[] args) throws Exception {

//        Showrc();
//        inserthr();
//        insrtrm();
//        insrtrmps();
//        deleterps();
//        updaterps();


    }
    public static void Showrc() throws Exception{
        String sql ="select *  from branch";
        String url ="jdbc:mysql://localhost:3306/branch";
        String username ="root";
        String password ="9159608502";


        Connection con = DriverManager.getConnection(url,username,password);
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(sql);
        while( rs.next()) {

            int id = rs.getInt(1);
            String name = rs.getString(2);
            String address = rs.getString(3);

            System.out.print(id + " ");
            System.out.print(name + " ");
            System.out.println(address);
        }
        con.close();
    }

    public static void inserthr() throws Exception{

        String url="jdbc:mysql://localhost:3306/branch";
        String username="root";
        String password="9159608502";
        String query="insert into branch value (6,'Tirunelveli','9-7 Ashok nagar')";

        Connection con=DriverManager.getConnection(url,username,password);
        Statement st=con.createStatement();
        int row=st.executeUpdate(query);
        System.out.println("Number of rows affected : "+row);

        con.close();
    }

    public static void insrtrm(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Branch id :");
        int id=in.nextInt();
        System.out.println("Enter Branch name :");
        String brname=in.next();
        System.out.println("Enter Address :");
        in.nextLine();
        String adrs=in.nextLine();

        String url="jdbc:mysql://localhost:3306/branch";
        String username="root";
        String password="9159608502";


        String query="insert into branch value("+id+",'"+brname+"','"+adrs+"')";

        try {
            Connection con=DriverManager.getConnection(url,username,password);
            Statement st = con.createStatement();
            int row = st.executeUpdate(query);

            System.out.println("Numbers of rows affected : "+row);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void insrtrmps(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Branch id :");
        int id=in.nextInt();
        System.out.println("Enter Branch name :");
        String brname=in.next();
        System.out.println("Enter Address :");
        in.nextLine();
        String adrs=in.nextLine();

        String url="jdbc:mysql://localhost:3306/branch";
        String username="root";
        String password="9159608502";


        String query="insert into branch value(?,?,?)";

        try {
            Connection con=DriverManager.getConnection(url,username,password);
            PreparedStatement ps=con.prepareStatement(query);
            ps.setInt(1,id);
            ps.setString(2,brname);
            ps.setString(3,adrs);
            int row=ps.executeUpdate();

            System.out.println("Numbers of rows affected : "+row);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void deleterps(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Branch id to delete the row :");
        int bid=in.nextInt();
        String url="jdbc:mysql://localhost:3306/branch";
        String username="root";
        String password="9159608502";

        String query="delete from branch where branch_id=?";

        try {
            Connection con = DriverManager.getConnection(url, username, password);
            PreparedStatement ps =con.prepareStatement(query);
            ps.setInt(1,bid);
            int row = ps.executeUpdate();
            System.out.print("Number of rows deleted : "+row);
        }
        catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    public static void updaterps() throws SQLException {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Branch id to update the row :");
        int brid=in.nextInt();
        System.out.println("Enter the address :");
        in.nextLine();
        String adrs=in.nextLine();

        String url="jdbc:mysql://localhost:3306/branch";
        String username="root";
        String password="9159608502";

        String query="Update branch set address=? where branch_id=?";

        Connection con = DriverManager.getConnection(url,username,password);
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1,adrs);
        ps.setInt(2,brid);
        int row=ps.executeUpdate();
        System.out.print("Number of row updated : "+row);
    }

}
