package gettingAndSetting;

public class Testyou {
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		GetTheData t=new GetTheData();
		System.out.println(t.getName());
		Thread.currentThread().setName("Loki");
		System.out.println(Thread.currentThread().getName());
	}

}
