package ex06.runnable_int;

public class Task 
	implements Runnable {
	char ch;

	public Task(char ch) {
		super();
		this.ch = ch;
	}

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("\n ch = " + ch);
			ch++;
		}
	}

}
