package snippet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteTest1 {
	public static void main(String[] args) {
		
		//1. WE KNOW THE DRIVER - org.hsqldb.jdbc.JDBCDriver.class
		//2. REGISTER THIS DRIVER
		try {
			System.out.println("Registering driver...");    
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver registered....");
			
			System.out.println("Trying to connect to the DB");
			Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb", "SA", "");
			
			System.out.println("Connected to the DB : "+conn);
			
			
			
			
			System.out.println("Enter Student Roll Number to delete: ");
			Scanner scan1 = new Scanner(System.in);
			int roll = scan1.nextInt();
			
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM Student WHERE ROLL_NO="+roll);
			
			if (rs.next()) {
					System.out.println("trying to make a statment");
					PreparedStatement pst = conn.prepareStatement("DELETE FROM STUDENT WHERE ROLL_NO=?");
					System.out.println("Statement created : "+pst);
					pst.setInt(1, roll);
		
					System.out.println("Trying to execute the prepared statement....");
					int rows = pst.executeUpdate();
					System.out.println("Deletion Successful Totals number of rows deleted is "+rows);
					pst.close();	conn.close();
			}
			else {
					StudentNotFoundException stdNtFnd = new StudentNotFoundException("Error404: Student details not Found: "+roll);
					throw stdNtFnd;
				}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		    
	}
}









