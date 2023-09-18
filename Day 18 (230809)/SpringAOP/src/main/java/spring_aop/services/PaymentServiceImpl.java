package spring_aop.services;

public class PaymentServiceImpl implements PaymentService {

	@Override
	public void makePayement(double amount) {
		
		
		System.out.println("\n Payment of amount : " + amount + " initiated");
		
		
		
		
		
		
		System.out.println("\n Payment of amount : " + amount + " complete");
		
	}

}
