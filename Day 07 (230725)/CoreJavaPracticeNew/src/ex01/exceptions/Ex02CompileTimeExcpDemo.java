package ex01.exceptions;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Ex02CompileTimeExcpDemo {

	public static void main(String[] args) {
		System.out.println("Start");
		try {
			FileOutputStream f = new FileOutputStream("data.txt");
		} catch (FileNotFoundException f) {
			System.out.println("Could not locate file to write");
		}

		System.out.println("Complete");
	}
}
