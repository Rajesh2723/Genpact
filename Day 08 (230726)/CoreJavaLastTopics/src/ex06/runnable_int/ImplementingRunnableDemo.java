package ex06.runnable_int;

public class ImplementingRunnableDemo {

	public static void main(String[] args) {
		
		System.out.println("-------1-------");
		
		Task t1 = new Task('a');
		Thread th1 = new Thread(t1);
		th1.start();
		
		System.out.println("-------2-------");
		
		Task t2 = new Task('M');
		Thread th2 = new Thread(t2);
		th2.start();
		
		System.out.println("-------3-------");

	}

}
