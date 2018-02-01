package dataBase;
import java.sql.*;
public class DataBase {
	public static void main (String[] args)throws Exception{
		Class.forName("com.mysql.jdbc.Driver");   
	    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:8889/","root","root");
	    Statement statement = connection.createStatement();
	   statement.executeUpdate("CREATE DATABASE CreateName");
	    statement.close(); 

}
}
// this is how a connection with a local server can be done, and after that how a new database can be created
