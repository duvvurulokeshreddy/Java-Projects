package exception_inCase9;

public class Test extends Thread{
	public static void main(String[] args) {
		Thread t=new Thread();
		t.start();
		System.out.println("Thread is scesswfully ");
		t.start();  //  java.lang.IllegalThreadStateException
		
		
	}

}
