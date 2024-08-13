package org;


class Eployee {
	
	int id;
	String name;
	double sal;
	Eployee(int id)
	{
		this.id=id;
	}
	Eployee(int id,String name)
	{
		this(id);
		this.name=name;
		
	}
	Eployee(int id,String name,double sal)
	{
		this(id,name);
		this.sal=sal;
	}
	public static void main(String[] args) {
		Eployee e=new Eployee(24,"Loki",5.4);
		System.out.println("id "+e.id);
		System.out.println("name "+e.name);
		System.out.println("sal "+e.sal);
		
	}
}
