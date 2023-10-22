package javapart2.oop;

public class Employees extends Candidate {
	String empid;
	double salary;
	public Employees(String name,int age,long contact,String empid,double salary)
	{
		super(name,age,contact);
		this.empid=empid;
		this.salary=salary;
		System.out.println("Parent member loading");
	}
public void displayE()
{
	displayC();
	System.out.println("Empid "+empid);
	System.out.println("Salary "+salary);
}
}
