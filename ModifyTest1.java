package snippet;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ModifyTest1 
{
	public static void main(String[] args) 
	{
		
		//1. WE KNOW THE DRIVER - org.hsqldb.jdbc.JDBCDriver.class
		//2. REGISTER THIS DRIVER
		try 
		{
			System.out.println("Registering driver...");    
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver registered....");
			
			System.out.println("Trying to connect to the DB");
			Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb", "SA", "");
			
			System.out.println("Connected to the DB : "+conn);
			
			System.out.println("trying to make a statment");
//			PreparedStatement pst = conn.prepareStatement("UPDATE STUDENT SET STDNAME=?, STDDOB=?, PHY_MARKS=?, CHEM_MARKS=?, MATHS_MARKS=? WHERE ROLL_NO=?");
//			System.out.println("Statement created : "+pst);
			
			
			
			System.out.println("Enter Student Roll Number: ");
			Scanner scan1 = new Scanner(System.in);
			int roll = scan1.nextInt();
			
			Statement st = conn.createStatement();
			
			ResultSet rs = st.executeQuery("SELECT * FROM STUDENT WHERE ROLL_NO="+roll);
			
			if (rs.next()) 
			{
				PreparedStatement pst = conn.prepareStatement("UPDATE STUDENT SET STDNAME=?, STDDOB=?, PHY_MARKS=?, CHEM_MARKS=?, MATHS_MARKS=? WHERE ROLL_NO=?");
				System.out.println("Statement created : "+pst);
				Scanner scan2 = new Scanner(System.in);
					System.out.println("Enter Student Name: ");
					String stdname = scan2.next();
					
					System.out.println("Enter Student DOB : ");
					Scanner scan3 = new Scanner(System.in);
					String stddob = scan3.next();
					Date dob = Date.valueOf(stddob);
					
					System.out.println("Enter Student Phy marks : ");
					Scanner scan4 = new Scanner(System.in);
					int  phy = scan4.nextInt();
					
					System.out.println("Enter Student Chem Marks: ");
					Scanner scan5 = new Scanner(System.in);
					int chem = scan5.nextInt();
					
					System.out.println("Enter Student Maths marks: ");
					Scanner scan6 = new Scanner(System.in);
					int maths = scan6.nextInt();
					
					
					int total = phy+chem+maths;
					String grade = null;
					
					System.out.println("------------------------------");
					
					if (total>280 && total<=300) 
					{
						grade = "A";
					}
					if (total>270 && total<=280) {
						grade = "B";
					}
					if (total>260 && total<=270) 
					{
						grade = "C";
					}
					if (total>200 && total<=260) 
					{
						grade = "D";
					} else {
						grade = "E";
					}
					System.out.println("------------------------------");
					

						System.out.println("Trying to execute the prepared statement....");
						
						pst.setString(1, stdname);
						pst.setDate(2, dob);
						pst.setInt(3, phy);
						pst.setInt(4, chem);
						pst.setInt(5, maths);
						pst.setInt(6, roll);
						int rows = pst.executeUpdate();
						System.out.println("Insertion Successfull Totals number of rows inserted is "+rows);
					
			}
			else 
			{
					StudentAlreadyExistException empext = new StudentAlreadyExistException("This employee number does not exists : "+roll);
					throw empext;
			}
					
			
		}	
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		    
	}
}





