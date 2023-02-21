import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

class Main{
    public static void main(String[] args) {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123");
            PreparedStatement psmt = con.prepareStatement("INSERT INTO MANAGER VALUES(?,?,?)");
            while(true)
            {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter employee id : ");
                String eid = br.readLine();
                System.out.println("Enter employee name : ");
                String ename = br.readLine();
                System.out.println("Enter employee salary : ");
                double esal = Double.parseDouble( br.readLine() );

                psmt.setString(1,eid);
                psmt.setString(2,ename);
                psmt.setDouble(3,esal);

                int count = psmt.executeUpdate();
                if(count>0)
                    System.out.println(count + " records inserted");
                else   
                    System.out.println("no records inserted");

                System.out.println("Want to add more values (Yes/No) : ");
                String op = br.readLine();
                if( op.equalsIgnoreCase("No") )
                {
                    break;
                }
            }
            con.close();
        }
        catch(Exception e)
        {
            System.out.println( e );
        }
    }
}