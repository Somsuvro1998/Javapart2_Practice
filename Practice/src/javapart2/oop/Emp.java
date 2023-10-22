package javapart2.oop;

public class Emp {
	int eid;
	String name;
	double salary;
	public Emp(int eid,String name,double salary)
	{
		this.eid=eid;
		this.name=name;
		this.salary=salary;
	}
	public void display()
	{
		System.out.println("eid is "+eid);
		System.out.println("name is "+name);
		System.out.println("salary is "+salary);
	}
	public static void main(String[]args)
	{
		
		Emp a[]=new Emp[4];
		 a[0]=new Emp(102,"Tina",65000d);
		 a[1]=new Emp(202,"Sam",15000d);
		 a[2]=new Emp(308,"Priya",25000d);
		 a[3]=new Emp(104,"Amar",65000d);
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		a[0].display();
		a[1].display();
		a[2].display();
		a[3].display();
		
	}

}
