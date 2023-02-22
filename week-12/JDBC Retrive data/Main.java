import java.util.*;
import java.sql.*;

class Main
{
    public static void main(String[] args) {
        

        try{
            
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123");
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery("select * from MANAGER");

            while(rs.next())
            {
                String eid = rs.getString(1);
                String ename = rs.getString(2);
                double esal = rs.getDouble(3);
                

                System.out.println("Employee ID : " + eid );
                System.out.println("Employee Name : " + ename );
                System.out.println("Employee Salary : " + esal );
            }

            con.close();
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
}