package differenceBetween_Start_Run_case2;

public class Thread1 {

	public static void main(String[] args) {
		MyThread t=new MyThread();
		t.run();
		for(int i=0;i<10;i++) {
			System.out.println("main Thread");
		}
	}
}
