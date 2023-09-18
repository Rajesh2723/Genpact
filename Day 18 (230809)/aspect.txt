package spring_aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	
	@Before("execution (* spring_aop.services.PaymentServiceImpl.makePayement(..))")
	public void runBeforeMakePayment() {
		System.out.println("\n Before make payment...");
	}
	
	@After("execution (* spring_aop.services.PaymentServiceImpl.makePayement(..))")
	public void runAfterMakePayment() {
		System.out.println("\n After make payment...");
	}
	
}
