package ex09.sync_block;

public class BlockSyncDemo {

	public static void main(String[] args) {
		// 1 object
		Table table1 = new Table();
		
		// 1 object is shared by 2 threads
		MyThread t1 = new MyThread(table1, 5);
		MyThread t2 = new MyThread(table1, 100);

		t1.start();
		t2.start();
	}

}
