package javapart2.oop;

public class ArrayEmployee {
	int eid;
	String name;
	double salary;

	public static void main(String[] args) {
		
Employee a[]=new Employee[4];
a[0]=new Employee(102,"tina",65000d);
a[1]=new Employee(202,"Alex",55000d);
a[2]=new Employee(302,"Sam",62000d);
a[3]=new Employee(404,"Som",90000d);
System.out.print(a[0]);
System.out.print(a[1]);
System.out.print(a[2]);
System.out.print(a[3]);
a[0].display();
a[1].display();
a[2].display();
a[3].display();

	}
	public ArrayEmployee(int eid,String name,double salary)
	{
		this.eid=eid;
		this.name=name;
		this.salary=salary;
	}
	public void display()
	{
		System.out.println(eid);
		System.out.println(name);
		System.out.println(salary);
	}

}
