package ex02.dml;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import util.DBUtils;

public class Ex03UpdateData {

	public static void main(String[] args) {
		final String updateQuery = "UPDATE employee " + "SET salary = ?, is_on_leave = ?, " + "bio = ? WHERE _id = ?";

		try (Connection c = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PWD);
				PreparedStatement pStmt = c.prepareStatement(updateQuery);
				FileReader fReader = new FileReader("files/bio_new.txt");
				BufferedReader reader = new BufferedReader(fReader))

		{

			// Get the data ready
			double newSalary = 40000;
			boolean newLeaveStatus = false;

			// Read the content of the file
			StringBuilder newBio = new StringBuilder("");
			String line = "";

			while ((line = reader.readLine()) != null) {
				newBio.append(line).append("\n");
			}

			int idToChange = 2;

			// Bind the data
			// "UPDATE employee SET salary = ?, is_on_leave = ?, "
			// + "bio = ? WHERE _id = ?";
			pStmt.setDouble(1, newSalary);
			pStmt.setBoolean(2, newLeaveStatus);
			pStmt.setString(3, newBio.toString());
			pStmt.setInt(4, idToChange);

			int result = pStmt.executeUpdate();

			if (result == 1) {
				System.out.println("\n Data updated successfully");
			} else {
				System.out.println("\n Data can't be updated");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
