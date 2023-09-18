package ex01.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex07FinallyDemo {

	public static void main(String[] args) {

		FileReader fileReader = null;
		FileWriter fileWriter = null;

		try {
			// Source and Target file names
			final String SOURCE = "files/source.txt";
			final String DESTINATION = "files/target.txt";

			// Initializing reader and writer
			fileReader = new FileReader(SOURCE);
			fileWriter = new FileWriter(DESTINATION);

			// File reading
			int ch;

			StringBuilder sb = new StringBuilder("");

			while ((ch = fileReader.read()) != -1) {
				sb.append((char) ch);
			}

			// File writing
			fileWriter.write(sb.toString());

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			// close the connections
			if (fileReader != null)
				try {
					fileReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			if (fileWriter != null)
				try {
					fileWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
}