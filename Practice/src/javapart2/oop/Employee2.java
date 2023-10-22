package javapart2.oop;

public class Employee2 {
	int eid;
	String name;
	public Employee2(int eid,String name)
	{
		this.eid=eid;
		this.name=name;
	}
	public boolean equals(Employee2 ob)
	{
		if(this.name.equals(ob.name))
			return true;
		else
			return false;
	}


	public static void main(String[] args) {
Employee2 e1=new Employee2(123,"Som");
Employee2 e2=new Employee2(456,"Somsuvro Pal");
Employee2 e3=new Employee2(567,"Somsuvro Pal");



System.out.println(e1.equals(e2));
System.out.println(e1.equals(e3));
System.out.println(e2.equals(e3));



	}

}
