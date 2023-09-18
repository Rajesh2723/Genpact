package property.injection.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionsInjection {

	public static void main(String[] args) {
		System.out.println( "Inside Collections Injection class\n" );
        ApplicationContext context = 
        		new ClassPathXmlApplicationContext("property/injection/collections/collections_config.xml");

        Employee employee1 = (Employee) context.getBean("employee1");
        System.out.println(employee1);
        System.out.println("Mobile Numbers type: " + employee1.getEmpMobileNos().getClass().getName());

        System.out.println("------------------------------------------------------");
        Employee employee2 = (Employee) context.getBean("employee2");
        System.out.println(employee2);
        System.out.println("Addresses type: " + employee2.getAddresses().getClass().getName());
        
        System.out.println("------------------------------------------------------");
        Employee employee3 = (Employee) context.getBean("employee3");
        System.out.println(employee3);
        System.out.println("Courses Duration type: " + employee3.getCoursesDuration().getClass().getName());
        System.out.println("Leaves Record type: " + employee3.getLeavesRecord().getClass().getName());
        
	}

}