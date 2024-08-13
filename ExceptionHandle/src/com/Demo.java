package com;

class Demo {

	public static void main(String[] args) {
	for (int i=1;i<=5;i++)
	{
		System.out.println(i);
	}
	try {
	Thread.sleep(9000);
	}
	catch(Exception e)
	{
		System.out.println("not is found");
	}

	}

}
