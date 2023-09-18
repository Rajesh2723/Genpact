package ex09.sync_block;

public class Table {
	
	public void printTable(int number) {
	
		System.out.println("\n Table of Number (1) : " + number);
		System.out.println("\n Table of Number (2): " + number);
		
		synchronized(this){
			
			for(int i = 1 ; i <= 5; i++) {
				System.out.println(number + " X " + i + " = " + (number*i));
			
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			
			}
			
		}
		
		
		
		
		
	
	}
}
