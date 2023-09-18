package ex04.without_multith;

public class Task {
	char ch;

	public Task(char ch) {
		super();
		this.ch = ch;
	}

	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("\n ch = " + ch);
			ch++;
		}
	}

}
