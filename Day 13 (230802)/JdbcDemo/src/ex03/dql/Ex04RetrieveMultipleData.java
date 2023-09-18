package ex03.dql;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import util.DBUtils;

public class Ex04RetrieveMultipleData {

	public static void main(String[] args) {

		String fetchQuery = "SELECT * FROM employee";

		try (Connection c = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PWD);
				Statement stmt = c.createStatement();) {

			ResultSet rSet = stmt.executeQuery(fetchQuery);
			
//			stmt.close();
//			c.close();

			while (rSet.next()) {

				int id = rSet.getInt("_id");
				String name = rSet.getString("name");
				double salary = rSet.getDouble("salary");
				Date dateOfJoining = rSet.getDate("doj");

				String bio = rSet.getString("bio");
				Blob pic = rSet.getBlob("picture");

				// id = 2: 2_bio
				// id = 3: 3_bio
				// Write the fetched bio in the file
				String outputFilePath = "files/" + id + "_bio.txt";
				
				FileWriter fWriter = new FileWriter(outputFilePath);
				fWriter.write(bio);
				if (fWriter != null)
					fWriter.close();

				// Data to be written
				String outputImageFile = "files/" + id + "_pic.jpg";
				InputStream iStream = pic.getBinaryStream();
				FileOutputStream f = new FileOutputStream(outputImageFile);

				// Data is intermediately stored
				byte[] buffer = new byte[1024];
				int bytesRead;

				// data transfer to buffer
				while ((bytesRead = iStream.read(buffer)) != -1) {

					// data from buffer is written to .jpg
					f.write(buffer, 0, bytesRead);
				}

				if (f != null)
					f.close();

				System.out.println(id + ", " + name + ", " + salary + ", " + dateOfJoining);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
