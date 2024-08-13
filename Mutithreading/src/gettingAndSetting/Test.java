package gettingAndSetting;

public class Test {

	public static void main(String[] args) {
		DataInSetting t=new DataInSetting();
		t.start();
		System.out.println("Main Method exceuted By Thread : "+Thread.currentThread().getName());
	}
}
