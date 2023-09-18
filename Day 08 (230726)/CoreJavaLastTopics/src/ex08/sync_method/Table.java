package ex08.sync_method;

public class Table {
	
	public synchronized void printTable(int number) {
	
		System.out.println("\n Table of Number : " + number);
		
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
