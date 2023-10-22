package javapart2.oop;

public class Employee1 {
	float salary;
	long contactno;
	public Employee1(float salary,long contactno)
	{
		this.salary=salary;
		this.contactno=contactno;
		
	}
	public String toString()
	{
		return "salary of "+contactno+" is "+salary;
	}

	public static void main(String[] args) {
Employee1 e1=new Employee1(20000f,45123654586l);
System.out.println(e1);
	}

}
