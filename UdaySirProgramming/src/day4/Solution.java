package day4;

import java.util.ArrayList;

public class Solution {
	
	public static void main(String[] args) {
		ArrayList<MobileApp> app=new ArrayList<>();
		app.add(new Swiggy());
		app.add(new Uber());
		app.add(new PhonePay());
		
		for(MobileApp obj:app) {
			if(obj instanceof Swiggy) {
				Swiggy t=(Swiggy)obj;
				t.orderFood();
			}
			else if(obj instanceof Uber) {
				Uber u=(Uber) obj;
				u.bookCab();
			}
			else if(obj instanceof PhonePay) {
				PhonePay p=(PhonePay) obj;
				p.payAmount();
			}
		}
		
	}

}
