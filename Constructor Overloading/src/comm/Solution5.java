package comm;

class Solution5 {

	public static void main(String[] args) {
	    
		Pen p1=new Pen("hello",5.5);
		Pen p2=new Pen("hel",5.4);
		Pen p3=new Pen("heu",5.3);
		Pen [] p= {p1,p2,p3};
		for(int i=0;i<p.length;i++)
			
		{
			System.out.println(p[i].brand +" "+"cost of the "+p[i].cost);
		}
		
		
	}
	}
