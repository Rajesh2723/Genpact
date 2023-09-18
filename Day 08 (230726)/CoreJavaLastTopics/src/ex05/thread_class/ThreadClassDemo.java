package ex05.thread_class;

public class ThreadClassDemo {

	public static void main(String[] args) {
		
		System.out.println("-------1-------");
		
		Task t1 = new Task('a');
		t1.start();
		
		System.out.println("-------2-------");
		
		Task t2 = new Task('M');
		t2.start();
		
		System.out.println("-------3-------");

	}

}
