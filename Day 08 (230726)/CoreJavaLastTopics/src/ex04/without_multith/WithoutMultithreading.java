package ex04.without_multith;

public class WithoutMultithreading {

	public static void main(String[] args) {
		
		System.out.println("-------1-------");
		
		Task t1 = new Task('a');
		t1.run();
		
		System.out.println("-------2-------");
		
		Task t2 = new Task('M');
		t2.run();
		
		System.out.println("-------3-------");

	}

}
