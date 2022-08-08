import java.sql.*;
 
public class Brand_Daso {
    public static void main(String arg[])
    {
        Connection connection = null;
        try {
            // below two lines are used for connectivity.
           // Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                "jdbc:mysql:///mysql",
                "root", "Yash_1408");
 
            // mydb is database
            // mydbuser is name of database
            // mydbuser is password of database
 
            Statement statement;
            statement = connection.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery(
                "select * from Brand_Dassault");
            int deptno;
            String dname;
            while (resultSet.next()) {
            	deptno = resultSet.getInt("DeptNo");
            	dname = resultSet.getString("DeptName").trim();
                System.out.println("Brand Number	 :	 " + deptno
                                   + "\nBrand Name	:	 " + dname);
                System.out.println("-----------------------------------------------------------");
            }
            resultSet.close();
            statement.close();
            connection.close();
        }
        catch (Exception exception) {
            System.out.println(exception);
        }
    } 
} 