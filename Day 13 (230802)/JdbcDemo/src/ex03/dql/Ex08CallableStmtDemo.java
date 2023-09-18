package ex03.dql;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

import util.DBUtils;

public class Ex08CallableStmtDemo {

	public static void main(String[] args) {
		final String URL = "jdbc:mysql://localhost:3306/training";
		int noOfTrainees = 0;
		
		try(Connection c = DriverManager.getConnection(URL, DBUtils.USER, DBUtils.PWD);
				CallableStatement callStmt = c.prepareCall("{call getNoOfTraineesWithFees(?)}");	
				){
			
			int numFees = 10000;
			
			callStmt.setInt(1, numFees);
			callStmt.registerOutParameter(1, Types.INTEGER);
			
			callStmt.execute();
			noOfTrainees = callStmt.getInt(1);
			
			System.out.println("\n No of trainees : " + noOfTrainees);

		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
