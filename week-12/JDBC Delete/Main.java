import java.sql.*;
import java.io.*;

class Main
{
    public static void main(String[] args) {
            

        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123");

            Statement smt = con.createStatement();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );

            while(true)
            {
                System.out.println("Enter deletion of employee id: ");
                String eid = br.readLine();

                int count = smt.executeUpdate("delete from MANAGER where EID='" + eid +"'");
                if(count == 1 )
                    System.out.println( count + " rows deleted");
                else    
                    System.out.println("No rows deleted");
                
                System.out.println("Do you want to delete more rows (Yes/No): ");
                String op = br.readLine();
                if( op.equalsIgnoreCase("No"))
                    break;
                
            }
            con.close();

        }
        catch( Exception e)
        {
            e.printStackTrace();
        }

    }
}