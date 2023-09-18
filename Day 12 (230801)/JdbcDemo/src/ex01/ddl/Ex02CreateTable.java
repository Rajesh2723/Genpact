package ex01.ddl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex02CreateTable {

	public static void main(String[] args) {
		
		// Step 1: Once Driver is loaded, we do not load it again
		final String URL = "jdbc:mysql://localhost:3306/company";
		final String USER = "root";
		final String PWD = "1234";
		final String query = "CREATE TABLE employee (\r\n"
				+ "  _id INT NOT NULL AUTO_INCREMENT,\r\n"
				+ "  name VARCHAR(30) NOT NULL,\r\n"
				+ "  salary DOUBLE NOT NULL,\r\n"
				+ "  doj DATE NOT NULL,\r\n"
				+ "  is_on_leave BIT(1) NOT NULL,\r\n"
				+ "  bio LONGTEXT,\r\n"
				+ "  picture BLOB,\r\n"
				+ "  PRIMARY KEY (_id))";
		
		try(Connection con = DriverManager.getConnection(URL, USER, PWD);
				Statement stmt = con.createStatement();){
			
			int result = stmt.executeUpdate(query);

			// Create table query returns 0 for successful table creation
			if(result == 0) System.out.println("Table created successfully");
			else System.out.println("Table can't be created");

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
