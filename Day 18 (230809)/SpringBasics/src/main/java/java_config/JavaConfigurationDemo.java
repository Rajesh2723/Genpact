package java_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigurationDemo {

	public static void main(String[] args) {
		ApplicationContext ctx = 
				new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Student student = ctx.getBean("getStudent", Student.class);
		
		System.out.println("Student's book name : " + student.getBook().getName());
	}

}
