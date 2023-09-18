package ex09.maps;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		var formData = 
				new LinkedHashMap<String, String>();
		formData.put("name", "Kaustubh");
		formData.put("email", "kaustubh@gmail.com");
		formData.put("mobile", "9926535458");
		formData.put("username", "k.choudhary");
		formData.put("password", "1234");
		System.out.println("1. " + formData);

		System.out.println("2. " + formData.containsKey("Name"));
		System.out.println("3. " + formData.containsValue("9926535458"));

		String address = formData.get("address");
		if (null != address) {
			System.out.println("4. " + address.toUpperCase());
		} else {
			System.out.println("4. data absent");
		}

		Set<String> keysOfForm = formData.keySet();
		System.out.println("5. " + keysOfForm);

		Collection<String> valueOfForm = formData.values();
		System.out.println("6. " + valueOfForm);

		formData.put("mobile", "9988776655");
		System.out.println("7. " + formData);

		// Only 1 null key but multiple null values allowed
		formData.put(null, null);
		System.out.println("8. " + formData);

	}

}
