package javapart2.oop;

public class Worker extends PeopleOfBombay {
	String wid;
	String designation;
	public void display(String name,int age,long contact,String wid,String designation)
	{
	super(name,age,contact);
	this.wid=wid;
	this.designation=designation;
	
	
		
	}
	public void display()
	{
		System.out.println("I am an Oracle Worker");
	}
public void detailsW()
{
	System.out.println("name of worker "+name);
	System.out.println("age of  worker"+age);
	System.out.println("contact of worker "+age);
	System.out.println("wid of worker "+wid);
	System.out.println("designation of worker "+designation);
}
}
