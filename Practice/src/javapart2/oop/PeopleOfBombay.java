package javapart2.oop;

public class PeopleOfBombay

{
	String name;
	int age;
	long contact;
	static String district="Bombay";
	public PeopleOfBombay(String name,int age,long contact)
	{
	this.name=name;
	this.age=age;
	this.contact=contact;
	}
	public void display()
	{
		System.out.println("Bombay Resident");
	}

}
