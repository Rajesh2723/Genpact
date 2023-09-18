package ex10.limitation;

public class BlockSyncDemo {

	public static void main(String[] args) {
		// 2 objects
		Table table1 = new Table();
		Table table2 = new Table();
		
		// 2 objects are shared by 2 threads
		MyThread t1 = new MyThread(table1, 5);
		MyThread t2 = new MyThread(table2, 100);

		t1.start();
		t2.start();
	}

}
