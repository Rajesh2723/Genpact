package spring_aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring_aop.services.PaymentService;


public class App {
	public static void main(String[] args) {
		
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("config.xml");
				
		// PaymentService = (PaymentService)Object;
		PaymentService p = (PaymentService)ctx.getBean("payment");
		p.makePayement(10000);
		
		PaymentService p2 = (PaymentService)ctx.getBean("payment");
		p2.makePayement(20000);
	}
}
