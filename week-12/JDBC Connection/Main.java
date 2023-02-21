import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

class Main
{
    public static void main(String[] args) {

        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123");
            Statement smt = con.createStatement();
            smt.executeUpdate("create table MANAGER(eid varchar[10], ename varchar[20], esal number)");
            System.out.println("table created successfully");
            con.close();
        }
        catch( Exception e)
        {
            System.out.println(e);
        }

    }
}