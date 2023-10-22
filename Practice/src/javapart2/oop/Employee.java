package javapart2.oop;

public class Employee extends PeopleOfBangalore{
	String sid;
	String designation;
	public Employee(String name,int age,long contact,String sid,String designation)
	{
		super(name, age, contact);
		this.sid=sid;
		this.designation=designation;
		
	}
	public void display()
	{
		System.out.println("I am an employee of Oracle");
		
	}
	public void detailsE()
	{
		System.out.println("name of student "+name);
		System.out.println("age of Student "+age);
		System.out.println("contact of student "+contact);
		System.out.println("sid of Employee "+sid);
		System.out.println("designation of Employee "+designation);
		
	}
	

}
