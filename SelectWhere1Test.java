package snippet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class SelectWhere1Test {
	public static void main(String[] args) {
		//READ
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
			System.out.println("Enter Student Roll no: ");
			Scanner scan = new Scanner(System.in);
			int eno = scan.nextInt();
			ResultSet rs = statement.executeQuery("SELECT * FROM STUDENT WHERE ROLL_NO="+eno);
			System.out.println("Statement executed, got the result....");
				
			if (rs.next()) {
				int roll = rs.getInt(1) ; // get the first column (int type) output
				String name = rs.getString(2) ;
				String dob = rs.getString(3);
				int phy = rs.getInt(4);
				int chem = rs.getInt(5);
				int maths = rs.getInt(6);
				int total = rs.getInt(7);
				String grade = rs.getString(8);
						
				System.out.println("Student Roll No   : "+roll);
				System.out.println("Std name: "+name);
				System.out.println("Std DOB  : "+dob);
				System.out.println("Std phy  : "+phy);
				System.out.println("Std chem  : "+chem);
				System.out.println("Std maths : "+maths);
				System.out.println("Std total  : "+total);
				System.out.println("Std grade  : "+grade);
			}
			else {
				StudentAlreadyExistException exp = new StudentAlreadyExistException("Student Details does not exist...");
				throw exp;
			}
			rs.close();	statement.close();	conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		    
	}
}
/*


File handling
	- Object Serialization
	
		Object
			|
		----------
		|		|
		file	Database
		|			|
serialization		Persistence



1		Database software
		|MYSQL / HSQL 
		|
2		Database Driver - HSQLDB.JAR 
		|
3		Java Program
		to connect to the DB
		|
		interact with the db
		
		
	following diagram is NOT of inheritance
	
	
			   Driver.class <-- interface
				|  |
				|  HSQLDB.jar (1. KNOW YOUR DB DRIVER)
				|    ( org.hsqldb.jdbc.JDBCDriver.class)
				|			implementation of the interface
				|
				|
			DriverManager
				|    - load the driver (2. LOAD IT )
				|    - connect to the database (3. CONNECT TO THE DB)				
			Connection
				|
	--------------------------------
	|3. MAKE A STATEMENT
	Statement
	|4. RUN THE STATEMENT
	|5. ACQUIRE THE RESULT 
	|6. PROCESS THE RESULT
	|7. CLOSE THE RESULT, STATEMENT, CONNECTION
				
			


*/










