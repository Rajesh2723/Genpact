package ex03.serl_desrl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ex02DeserializationDemo {

	public static void main(String[] args) {

		try (FileInputStream f = new FileInputStream("employee.dat"); 
				ObjectInputStream in = new ObjectInputStream(f)) {

			Employee e1 = (Employee) in.readObject();

			System.out.println(e1.getName());
			System.out.println(e1.getSalary());
			System.out.println(e1.isPresent());

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
