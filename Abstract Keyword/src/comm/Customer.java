package comm;

class Customer extends Amazon {
	
@Override
void buy()
{
	System.out.println("Buying the laptop");
}
@Override
void pay()
{
	System.out.println("Paying is 50000 ");
}
	public static void main(String[] args) {
	Customer c1=new Customer();
	c1.buy();
	c1.pay();
	System.out.println();
	Customer c2=new Customer();
	c2.buy();
	c2.pay();
	}

}
