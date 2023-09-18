package ex01.exceptions;

import java.io.FileReader;
import java.io.FileWriter;

public class TryWithResources {

	public static void main(String[] args) {

		// Source and Target file names
		final String SOURCE = "files/source.txt";
		final String DESTINATION = "files/target.txt";

		// try with resources - mandatory condition
		// class MUST implement AutoCloseable interface
		try (FileReader fileReader = new FileReader(SOURCE); 
				FileWriter fileWriter = new FileWriter(DESTINATION);
				) {

			// File reading
			int ch;

			StringBuilder sb = new StringBuilder("");

			while ((ch = fileReader.read()) != -1) {
				sb.append((char) ch);
			}

			// File writing
			fileWriter.write(sb.toString());

		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
		}

	}

}
