package ex05.thread_class;

public class Task extends Thread {
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
