package threadPriorties;

public class Test {

	public static void main(String[] args) {
		DefaultPrority t=new DefaultPrority();
		t.setPriority(10);
		t.start();
		for(int i=1;i<10;i++) {
			System.out.println("Main thread");
		}
	}
	
}
