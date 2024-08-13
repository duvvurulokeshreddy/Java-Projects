package overloadingRunMethodcase4;

public class MyThreads extends Thread {

	public void run() {
		System.out.println("No - Args Method ");
	}

	public void run(int i) {
		System.out.println("Int - Args Method");
	}

	/*
	 * By Default The start() should be default method .
	 */
}
