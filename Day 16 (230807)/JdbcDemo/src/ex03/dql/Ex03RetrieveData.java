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

import util.DBUtils;

public class Ex03RetrieveData {

	public static void main(String[] args) {

		String fetchQuery = "SELECT * FROM employee WHERE _id = ?";

		try {
			Connection c = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PWD);
			PreparedStatement pStmt = c.prepareStatement(fetchQuery);

			int idToFetch = 5;

			pStmt.setInt(1, idToFetch);

			ResultSet rSet = pStmt.executeQuery();

			if (rSet.next()) {

				int id = rSet.getInt("_id");
				String name = rSet.getString("name");
				double salary = rSet.getDouble("salary");
				Date dateOfJoining = rSet.getDate("doj");

				String bio = rSet.getString("bio");
				Blob pic = rSet.getBlob("picture");

				// Write the fetched bio in the file
				String outputFilePath = "files/fetchedData.txt";
				FileWriter fWriter = new FileWriter(outputFilePath);
				fWriter.write(bio);
				if (fWriter != null)
					fWriter.close();

				String outputImageFile = "files/fetchedImage.jpg";

				// Data to be written
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
