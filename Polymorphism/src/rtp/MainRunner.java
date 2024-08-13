package rtp;
class FoodDeveliryApp {
	void orderFood() {
		System.out.println("order the food");
	}
}
	class Swigy extends FoodDeveliryApp {
		@Override
		void orderFood() {
			System.out.println("order the in Pizza");
		}
	}
class Zomato extends FoodDeveliryApp {
	@Override
	void orderFood()
	{
		System.out.println("order the in Chicken");
	}
}
class MainRunner {
	static void selectApp(FoodDeveliryApp app)
	{
		app.orderFood();
	}
	public static void main(String[] args) {
		//1.Upcasting using method
		selectApp(new Swigy());
		selectApp(new Zomato());
		System.out.println("----------------");
		
		//2.upcasting using separate reference Variable
		FoodDeveliryApp f1=new Swigy();
		f1.orderFood();
		FoodDeveliryApp f2=new Zomato();
		f2.orderFood();
		
		System.out.println("-------------");
		//3.upcasting using single Reference
		FoodDeveliryApp app;
		app=new Swigy();
		app.orderFood();
		app=new Zomato();
		app.orderFood();
	}

}

