package question2;
import java.sql.*;
public class RetrieveInformation {
	  public static void main(String[] args)throws SQLException, ClassNotFoundException
	  {
	          // TODO Auto-generated method stub
			String url = "jdbc:mysql://localhost:3306/sakila";		
			String username = "root";										
			String password = "9693@Lev";
			//Class.forName("com.mysql.jdbc.driver");
	    {
	        try
	        {
	            //establish the connection
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/authors_db", "root", "");

	            //create statement
	            Statement stmt = con.createStatement();

	            //query to be executed
	            String query = "SELECT author_id, name, city FROM authors WHERE city LIKE 'S%'";

	            //execute query
	            ResultSet rs = stmt.executeQuery(query);

	            //iterating over the result
	            while (rs.next()) 
	            {
	                int author_id = rs.getInt(1);
	                String name = rs.getString(2);
	                String city = rs.getString(3);

	                System.out.println("Author ID : " + author_id + ", Name : " + name + ", City : " + city);
	            }

	            //closing the connection
	            con.close();
	        }
	        catch (Exception e) 
	        {
	            System.out.println(e);
	        }
	    }
	  }
}
