package ex03.dql;

import java.sql.*;

import util.DBUtils;

public class Ex02ResultSetMetadata {

	public static void main(String[] args) {
		
		try(Connection c = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PWD);
			Statement stmt = c.createStatement();	
			ResultSet rSet = stmt.executeQuery("SELECT * FROM employee");
				){
			
			ResultSetMetaData rSetMetaData = rSet.getMetaData();
			
			int columnCount = rSetMetaData.getColumnCount();
			System.out.println("\n columnCount : " + columnCount);
			
			for(int i = 1; i <= columnCount ; i++) {
				String columnName = rSetMetaData.getColumnName(i);
				String columnType = rSetMetaData.getColumnTypeName(i);
				int columnSize = rSetMetaData.getColumnDisplaySize(i);
				
				System.out.println("\n------------------------");
				System.out.println("\n Column name : " + columnName);
				System.out.println("\n Column type : " + columnType);
				System.out.println("\n Column size : " + columnSize);
			}
			
			
			
			
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
