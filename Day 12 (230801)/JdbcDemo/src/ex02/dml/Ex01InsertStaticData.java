package ex02.dml;

import java.sql.*;

import util.DBUtils;

public class Ex01InsertStaticData {

	public static void main(String[] args) {
		
		final String insertQuery = 
				"INSERT INTO employee"
				+ "(name, salary, doj, is_on_leave, bio, picture) "
				+ "VALUES ('Ajay', 40000, '2022-10-10', "
				+ "true, 'test', '101')";
		
		try(Connection c = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PWD);
			Statement stmt = c.createStatement();){
		
			int result = stmt.executeUpdate(insertQuery);
	
			if(result==1) {
				System.out.println("\n Data inserted successfully");
			} else {
				System.out.println("\n Data could not be inserted");
			}

		} catch(SQLException s) {
			s.printStackTrace();
		}
	
	}

	
}
