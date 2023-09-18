package ex03.dql;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.DBUtils;

public class Ex06CallableStmtDemo {

	public static void main(String[] args) {
		final String URL = "jdbc:mysql://localhost:3306/training";
		
		try(Connection c = DriverManager.getConnection(URL, DBUtils.USER, DBUtils.PWD);
				CallableStatement callStmt = c.prepareCall("{call getTraineesNames (?, ?)}");	
				){
			
			callStmt.setString(1, "Java");//RoR
			callStmt.setDouble(2, 10000);

			boolean hasRecords = callStmt.execute();
			System.out.println("hasRecords : " + hasRecords);
			
			List<String> names = new ArrayList<String>();

			if(hasRecords) {
				
				ResultSet rSet = callStmt.getResultSet();
				
				while (rSet.next()) {
				
					names.add(rSet.getString("name"));
				
				}
			} else {
				System.out.println("\n Data not present");
			}

			System.out.println(names);

		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
