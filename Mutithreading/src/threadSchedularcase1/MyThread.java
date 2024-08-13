package threadSchedularcase1;

public class MyThread extends Thread{

	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Run Method");
		}
	}
	
	/*
	 * The Output should be changed By thread Scheduler
	 */
}
