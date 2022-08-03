package snippet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectAllTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Registering driver...");    
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver registered....");
			
			System.out.println("Trying to connect to the DB");
			Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb", "SA", "");
			
			System.out.println("Connected to the DB : "+conn);
			
			System.out.println("trying to make a statment");
			Statement statement = conn.createStatement();
			System.out.println("Statement created : "+statement);
			
			System.out.println("Trying to execute the statement....");
			ResultSet rs = statement.executeQuery("SELECT * FROM STUDENT");
			System.out.println("Statement executed, got the result....");
				
			while (rs.next()) {
				int roll = rs.getInt(1) ; // get the first column (int type) output
				String name = rs.getString(2) ;
				String dob = rs.getString(3);
				int phy = rs.getInt(4);
				int chem = rs.getInt(5);
				int maths = rs.getInt(6);
				int total = rs.getInt(7);
				String grade = rs.getString(8);
				System.out.println("---------------------------");	
				System.out.println("Student Roll No   : "+roll);
				System.out.println("Std name: "+name);
				System.out.println("Std DOB  : "+dob);
				System.out.println("Std phy  : "+phy);
				System.out.println("Std chem  : "+chem);
				System.out.println("Std maths : "+maths);
				System.out.println("Std total  : "+total);
				System.out.println("Std grade  : "+grade);
				System.out.println("---------------------------");
			}
			
			rs.close();	statement.close();	conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
