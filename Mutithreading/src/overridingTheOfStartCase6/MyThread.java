package overridingTheOfStartCase6;

public class MyThread  extends Thread{
	
	public void start() {
		System.out.println("Start Method");
	}

	public void run() {
		System.out.println("Run Method");
	}
}
