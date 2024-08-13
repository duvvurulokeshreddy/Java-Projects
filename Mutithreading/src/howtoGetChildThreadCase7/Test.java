package howtoGetChildThreadCase7;

public class Test {

	public static void main(String[] args) {
		yThread t=new yThread();
		t.start();
		System.out.println("Main Thread");
	}

}
