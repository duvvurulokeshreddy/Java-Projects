package comm;

abstract class Employee{
abstract void work() ;
}

class Tom extends Employee {
	

	@Override
	void work() {
		System.out.println("Tom is working");
			}
	
}
	


class Solution {

	public static void main(String[] args) {
		Tom t =new Tom();
		t.work();
		t.work();
		System.out.println("Tom"+" ");
	}

}
