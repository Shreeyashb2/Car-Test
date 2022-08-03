import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import snippet.StudentAlreadyExistException;


public class InsertTest1 {
	public static void main(String[] args) {
		
		//1. WE KNOW THE DRIVER - org.hsqldb.jdbc.JDBCDriver.class
		//2. REGISTER THIS DRIVER
		
			System.out.println("Registering driver...");    
			try {
				DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Driver registered....");
			
			System.out.println("Trying to connect to the DB");
			Connection conn;
			try {
				conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb", "SA", "");
				System.out.println("Connected to the DB : "+conn);
				System.out.println("trying to make a statment");
				PreparedStatement st = conn.prepareStatement("INSERT INTO STUDENT VALUES(?,?,?,?,?,?,?,?);");
				
				Scanner scan1 = new Scanner(System.in);
				System.out.println("Enter Student Roll No: ");
				int stdroll = scan1.nextInt();
				
				Statement st1 = conn.createStatement();
				ResultSet rs1 = st1.executeQuery("SELECT * FROM STUDENT WHERE ROLL_NO="+stdroll);
				
				
				if (rs1.next()) {
				
				StudentAlreadyExistException exp = new StudentAlreadyExistException("Student Details already exists...");
				throw exp;		
				} 
				else {
					Scanner scan2 = new Scanner(System.in);
					System.out.println("Enter Student Name: ");
					String stdname = scan2.next();
					
					Scanner scan3 = new Scanner(System.in);
					System.out.println("Enter Student DOB: ");
					String stddob = scan3.next();
					
					Scanner scan4 = new Scanner(System.in);
					System.out.println("Enter Student Physics Marks: ");
					int stdphy = scan4.nextInt();
					
					Scanner scan5 = new Scanner(System.in);
					System.out.println("Enter Student Chemistry Marks: ");
					int stdchem = scan5.nextInt();
					
					Scanner scan6 = new Scanner(System.in);
					System.out.println("Enter Student Maths Marks: ");
					int stdmaths = scan6.nextInt();
			
					int total = stdphy+stdchem+stdmaths;
					String grade = null;
					
					if (total>280 && total<=300) 
					{
						grade = "A";
						st.setString(8, "A");
					}
					if (total>270 && total<=280) {
						grade = "B";
						st.setString(8, "B");
					}
					if (total>260 && total<=270) 
					{
						grade = "C";
						st.setString(8, "C");
					}
					if (total>200 && total<=260) 
					{
						grade = "D";
						st.setString(8, "D");
						 
					}	
					
						
						
						
						
						System.out.println("Student Roll No   : "+stdroll);
						System.out.println("Std name: "+stdname);
						System.out.println("Std DOB  : "+stddob);
						System.out.println("Std phy  : "+stdphy);
						System.out.println("Std chem  : "+stdchem);
						System.out.println("Std maths : "+stdmaths);
						System.out.println("Std total  : "+total);
						System.out.println("Std grade  : "+grade);
						
						try {
							st.setInt(1, stdroll);
							st.setString(2, stdname);
							st.setString(3, stddob);
							st.setInt(4, stdphy);
							st.setInt(5, stdchem);
							st.setInt(6, stdmaths);
							st.setInt(7, total);
							st.setString(8, grade);
							st.executeUpdate();
						} 
						catch (SQLException e) 
						{
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
				
						
						System.out.println("Record Inserted...");
						
						System.out.println("------------------------");
				
			}
		
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			
			
			
		}
	}

	
	


