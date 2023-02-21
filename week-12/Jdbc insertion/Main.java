import java.sql.Connection;
import java.sql.DriverManager;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
public class Main {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123");
			PreparedStatement psmt = con.prepareStatement("insert into MANAGER values(?,?,?)");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			while(true) {
				String name = br.readLine();
				String roll = br.readLine();
				double  sal = Double.parseDouble(br.readLine());
				psmt.setString(1, roll);
				psmt.setString(2, name);
				psmt.setDouble(3, sal);
				int count = psmt.executeUpdate();
				if(count > 0) {
					System.out.println(count + "record inserted");
				}
				else {
					System.out.println(count + "record inserted");
					
				}
				String ch = br.readLine();
				if(ch.equalsIgnoreCase("no")) {
					break;
				}
			}
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}