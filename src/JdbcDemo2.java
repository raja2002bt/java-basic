import java.sql.*;

public class JdbcDemo2 {
    public static void main(String[] args) throws Exception{

//        Showrecord();
//        inserthardrecord();
//        insertmannualrecord();
//        insertmannualrecordpst();
//        deleterecord();
//        updaterecord();
//        callstoredprocedure();
        callstoredprocedureparameter();
    }


    public static void Showrecord() throws Exception{                                             //select a record

        String url="jdbc:mysql://localhost:3306/Student1";
        String username="root";
        String password="9159608502";
        String query="select * from newemploye";

        Connection con = DriverManager.getConnection(url,username,password);
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(query);

        while (rs.next())
        {
            int id = rs.getInt(1);
            String fn = rs.getString(2);
            String ln = rs.getString(3);
            String dpt = rs.getString(4);
            int sal = rs.getInt(5);
            System.out.print(id + " ");
            System.out.print(fn + " ");
            System.out.print(ln + " ");
            System.out.print(dpt + " ");
            System.out.print(sal);
            System.out.println(" ");
        }

        con.close();

    }

    public static void inserthardrecord() throws Exception{                                             //insert record (hard code values)

        String url="jdbc:mysql://localhost:3306/Student1";
        String username="root";
        String password="9159608502";
        String query="insert into newemploye value (7,'Amul','Davis','Aso MD',60000)";

        Connection con = DriverManager.getConnection(url,username,password);
        Statement st = con.createStatement();
        int row = st.executeUpdate(query);
        System.out.println(row+" rows affected");
    }

    public static void insertmannualrecord() throws Exception{                                             //insert record (mannual code values)

        String url="jdbc:mysql://localhost:3306/Student1";
        String username="root";
        String password="9159608502";

        int id =8;
        String firstname="Raja";
        String lastname="Pratheep";
        String dptname="Software Developer";
        int salary=50000;

        String query="insert into newemploye value ("+id+",'"+firstname+"','"+lastname+"','"+dptname+"',"+salary+");";

        Connection con = DriverManager.getConnection(url,username,password);
        Statement st = con.createStatement();
        int row = st.executeUpdate(query);
        System.out.println(row+" rows affected");

    }

    public static void insertmannualrecordpst() throws Exception{                                             //insert record (mannual code using prepare statement)

        String url = "jdbc:mysql://localhost:3306/Student1";
        String username = "root";
        String password = "9159608502";
        String query = "insert into newemploye value ( ? , ? , ? , ? , ?)";

        Connection con = DriverManager.getConnection(url,username,password);
        PreparedStatement pst = con.prepareStatement(query);
        pst.setInt(1,9);
        pst.setString(2,"Sanju");
        pst.setString(3,"Samson");
        pst.setString(4,"HR");
        pst.setInt(5,55000);
        int row = pst.executeUpdate();
        System.out.println(row+" Rows affected");
    }

    public static void deleterecord() throws Exception{                                             //delete record

        String url= "jdbc:mysql://localhost:3306/Student1 ";
        String username = "root";
        String password = "9159608502";

        int id=7;
        String query = "delete from newemploye where EmployeeId ="+id;

        Connection con = DriverManager.getConnection(url,username,password);
        Statement st = con.createStatement();
        int row = st.executeUpdate(query);
        System.out.println(row+" Rows affected");

        con.close();
    }

    public  static  void updaterecord() throws Exception{                                         //update record

        String url= "jdbc:mysql://localhost:3306/Student1 ";
        String username = "root";
        String password = "9159608502";

        int id=9;
        String name ="Sivaji";
        String query = "update newemploye set firstname='"+name+"' where EmployeeId="+id ;
        Connection con =DriverManager.getConnection(url,username,password);
        Statement st = con.createStatement();
        int row = st.executeUpdate(query);

        System.out.println(row+" Rows affected");

        con.close();
    }

    public static void callstoredprocedure() throws Exception{

        String url= "jdbc:mysql://localhost:3306/Student1 ";
        String username = "root";
        String password = "9159608502";

        Connection con=DriverManager.getConnection(url,username,password);
        CallableStatement cst = con.prepareCall("{call getemp()}");
        ResultSet rs = cst.executeQuery();
        while(rs.next()){
            int id = rs.getInt(1);
            String fn = rs.getString(2);
            String ln = rs.getString(3);
            String dpt = rs.getString(4);
            int sal = rs.getInt(5);
            System.out.print(id + " ");
            System.out.print(fn + " ");
            System.out.print(ln + " ");
            System.out.print(dpt + " ");
            System.out.print(sal);
            System.out.println(" ");
        }

        con.close();

    }

    public static  void  callstoredprocedureparameter() throws Exception{

        String url = "jdbc:mysql://localhost:3306/Student1 ";
        String username ="root";
        String password ="9159608502";
        int eid=8;
        Connection con=DriverManager.getConnection(url,username,password);
        CallableStatement cst = con.prepareCall("{call getempbyid(?)}");
        cst.setInt(1,eid);
        ResultSet rs = cst.executeQuery();
        rs.next();
        int id = rs.getInt(1);
        String fn = rs.getString(2);
        String ln = rs.getString(3);
        String dpt = rs.getString(4);
        int sal = rs.getInt(5);
        System.out.print(id + " ");
        System.out.print(fn + " ");
        System.out.print(ln + " ");
        System.out.print(dpt + " ");
        System.out.print(sal);
        System.out.println(" ");

        con.close();
    }

}
