package howtoGetChildThreadCase7;

public class yThread extends Thread{
	public void start() {
		super.start();
		System.out.println("Start Method");
	}

	public void run() {
		System.out.println("Run Method");
	}
}
