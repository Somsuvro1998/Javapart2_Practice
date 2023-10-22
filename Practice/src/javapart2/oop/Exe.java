package javapart2.oop;

public class Exe {
	int eid;
	String name;
	double salary;
public Emp(int eid,String name,double salary)
{
	this.eid=eid;
	this.name=name;
	this.salary=salary;
}
public void displat()
{
	System.out.println("eid is "+eid);
	System.out.println("name is "+name);
	System.out.println("salary is "+salary);
}
}
