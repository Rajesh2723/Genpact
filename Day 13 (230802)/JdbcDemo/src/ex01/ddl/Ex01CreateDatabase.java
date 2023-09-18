package ex01.ddl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex01CreateDatabase {

	public static void main(String[] args) {
		
		Connection con = null;
		Statement stmt = null;
		
		try {
			// Step 1: Driver should be loaded
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Step 2. Connect to database
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306", "root", "1234");
			
			// Step 3. Create Statement
			stmt = con.createStatement();
			
			// Step 4. Prepare the Query
			String query = "CREATE SCHEMA company";
			
			// Step 5. Execute the Query
			// Step 6. Collect Data
			int result = stmt.executeUpdate(query);
			
			if(result == 1) System.out.println("Schema created successfully");
			else System.out.println("Schema can't be created");
			
		} catch (ClassNotFoundException e) {
			System.out.println("\n Driver class not found");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("\n SQL Exception");
			e.printStackTrace();
		} finally {
			// Step 7. Close Resources
			try {
				if(stmt != null) stmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
