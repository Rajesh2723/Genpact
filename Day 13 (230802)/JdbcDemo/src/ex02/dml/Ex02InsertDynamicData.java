package ex02.dml;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.time.LocalDate;

import util.DBUtils;

public class Ex02InsertDynamicData {

	public static void main(String[] args) {
		final String insertQuery = "INSERT INTO employee" 
						+ "(name, salary, doj, is_on_leave, " 
						+ "bio, picture) "
						+ "VALUES (?,?,?,?,?,?)";

		try (Connection c = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PWD);
				PreparedStatement pStmt = c.prepareStatement(insertQuery);
				FileReader fReader = new FileReader("files/bio.txt");
				BufferedReader reader = new BufferedReader(fReader)) {

			// data
			String fullName = "Sanjay Saxena";
			double salary = 55000;
			// java.time.LocalDate => 10th Jan 2022
			LocalDate dateOfJoining = LocalDate.of(2020, 9, 1);
			boolean isOnLeave = false;

			// Read the content of the file
			StringBuilder sb = new StringBuilder("");
			String line = "";

			while ((line = reader.readLine()) != null) {
				sb.append(line).append("\n");
			}
			
			// Read the content of an image
			File imageFile = new File("files/emp3.jpg");
			byte[] imageData = new byte[(int) imageFile.length()];
			
			FileInputStream fStream = new FileInputStream(imageFile);
			fStream.read(imageData);

			// Data reading is complete, now close the connection
			if (fStream != null)
				fStream.close();

			// Binding the data
			// name, salary, doj, is_on_leave, bio, picture
			// ?, ?, ?, ?, ?, ?
			pStmt.setString(1, fullName);
			pStmt.setDouble(2, salary);

			// Convert java.time.LocalDate into java.sql.Date
			pStmt.setDate(3, Date.valueOf(dateOfJoining));
			pStmt.setBoolean(4, isOnLeave);

			// Convert StringBuilder into String
			pStmt.setString(5, sb.toString());
			pStmt.setBytes(6, imageData);

			int result = pStmt.executeUpdate();

			if (result == 1) {
				System.out.println("\n Data inserted successfully");
			} else {
				System.out.println("\n Data cant be inserted");
			}
			
		} catch (SQLException s) {
			s.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
