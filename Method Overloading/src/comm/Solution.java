package comm;

class Solution {

     
void display(int a) {
	System.out.println("a:"+a);
    	  
      }
void display(String a) {
	System.out.println("a:"+a); 
}

	  
void display(String b,int a) {
	System.out.println("a:"+a+"b:"+b);
	  
}
public static void main(String[] args) {
	Solution s=new Solution();
	s.display("ram",25);
	s.display("Tom");
}

}
