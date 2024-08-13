package com;

class Demo1 {
	static void display() {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			try {
			Thread.sleep(1000);
			}
			catch(Exception e) {
				System.out.println("i");
			}
		}
	}

	public static void main(String[] args) {
		try {
		display();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
