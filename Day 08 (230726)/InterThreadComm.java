class Customer{  
	int amount;

	Customer (int amount){
		this.amount = amount;
	}

	synchronized void withdraw(int amount){  
		System.out.println("Going to withdraw...");  
		// 10000<15000
		if(this.amount<amount){  
			System.out.println("Less balance; waiting for deposit...");  
			try{
				wait();
			}catch(Exception e){
				System.out.println("Exception: " + e.getMessage());
			}  
		}  

		this.amount -= amount;  
		System.out.println("withdraw completed...");  
	}  

	synchronized void deposit(int amount){  
		System.out.println("going to deposit...");  
		this.amount+=amount;  
		System.out.println("deposit completed... ");  
		notify();  
	}  
}  

class InterThreadComm {  
	public static void main(String args[]) throws Exception{  
		final Customer c = new Customer(10000); 
		
		new Thread(){
			public void run(){
				c.withdraw(8000);
			}  
		}.start();
		
		Thread.sleep(500);
		
		new Thread(){  
			public void run(){
				c.deposit(10000);
			}  
		}.start();  
	}
}  