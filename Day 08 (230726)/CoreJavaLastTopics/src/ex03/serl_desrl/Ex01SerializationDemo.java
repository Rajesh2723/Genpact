package ex03.serl_desrl;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Ex01SerializationDemo {

	public static void main(String[] args) {
		Employee emp = new Employee("Yash", 20000, true);
		
		// Convert Object into byte stream
		// And store it into a file
		
		try (FileOutputStream fileOut = new FileOutputStream("employee.dat");
				ObjectOutputStream out = new ObjectOutputStream(fileOut);) {
			
			out.writeObject(emp);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// instance of
		System.out.println(emp instanceof Serializable);
		
	}

}
