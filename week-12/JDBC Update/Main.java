import java.sql.*;
import java.io.*;

class Main
{
    public static void main(String[] args) 
    {
        
        Connection con = null;
        Statement smt = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123");

            smt = con.createStatement();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter employee no: ");
            String eid = br.readLine();
            System.out.println("Enter the salary to be updated: ");
            double esal = Double.parseDouble(br.readLine());

            int count = smt.executeUpdate("update MANAGER set ESAL="+ esal + " where EID='" + eid + "'");

            if(count>0)
                System.out.println(count + " rows updated");
            else    
                System.out.println( "no rows updated");


        }
        catch( Exception e )
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                con.close();
                smt.close();

            }
            catch( SQLException e)
            {
                System.out.println( e );
            }
        }
    }
}