package ex03.dql;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import util.DBUtils;

public class Ex07CallableStmtDemo {

	public static void main(String[] args) {
		final String URL = "jdbc:mysql://localhost:3306/training";
		int noOfPhpStudents = 0;
		
		try(Connection c = DriverManager.getConnection(URL, DBUtils.USER, DBUtils.PWD);
				CallableStatement callStmt = c.prepareCall("{ call getNoOfPhpTrainees(?)}");	
				){
			
			callStmt.registerOutParameter(1, Types.INTEGER );
			
			callStmt.execute();
			noOfPhpStudents = callStmt.getInt(1);
			
			System.out.println("\n No of PHP students : " + noOfPhpStudents);

		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
