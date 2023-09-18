package ex10.limitation;

public class Table {

	public void printTable(int number) {

		System.out.println("\n Table of Number (1) : " + number);
		System.out.println("\n Table of Number (2): " + number);

		synchronized (Table.class) {
			for (int i = 1; i <= 5; i++) {
				System.out.println(number + " X " + i + " = " + (number * i));

				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		}

	}
}
