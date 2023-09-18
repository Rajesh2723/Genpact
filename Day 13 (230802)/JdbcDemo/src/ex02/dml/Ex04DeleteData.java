package ex02.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import util.DBUtils;

public class Ex04DeleteData {

	public static void main(String[] args) {
		final String deleteQuery = "DELETE FROM employee WHERE _id = ?";

		try(Connection c = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PWD);
				PreparedStatement pStmt = c.prepareStatement(deleteQuery)){
			
			int idToDelete = 1;
			
			pStmt.setInt(1, idToDelete);
			
			int result = pStmt.executeUpdate();

			if (result == 1) {
				System.out.println("\n Record deleted successfully");
			} else {
				System.out.println("\n Record can't be deleted");
			}
			
		} catch(SQLException s) {
			s.printStackTrace();
		}
	}

}
