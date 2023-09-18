package auto.wiring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWiringAnnotations {

	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("auto/wiring/annotation/auto_wiring.xml");

		Employee employee = (Employee) context.getBean("employee");
		System.out.println(employee);	
	}
}
