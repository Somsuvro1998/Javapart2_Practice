package javapart2.oop;

public class Employee3 {
	int eid;
	String name;
	public Employee3(int eid,String name)
	{
		this.eid=eid;
		this.name=name;
	}
	public boolean equals(Employee3 ob)
	{
		if(this.eid==ob.eid)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
Employee3 e1=new Employee3(123,"Som");
Employee3 e2=new Employee3(456,"Somsuvro Pal");
Employee3 e3=new Employee3(123,"Somsuvro Pal");

System.out.println(e1.equals(e2));
System.out.println(e1.equals(e3));
System.out.println(e2.equals(e3));



	}

}
