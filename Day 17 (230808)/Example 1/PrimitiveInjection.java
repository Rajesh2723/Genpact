package property.injection.primitive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrimitiveInjection {
	public static void main(String[] args) {
		System.out.println("Inside Primitive Injection class");
		// If the config file is inside src/main/java,
		// we don't need to specify the path
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("primitive_config.xml");

		Student student1 = (Student) context.getBean("student1");
		System.out.println(student1);

		Student student2 = (Student) context.getBean("student2");
		System.out.println(student2);

		Student student3 = (Student) context.getBean("student3");
		System.out.println(student3);
	}
}
