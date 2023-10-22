package javapart2.oop;

public class Trainee extends Employees {
String subject;
public Trainee(String name,int age,long contact,String empid,double salary,String subject)
{
	super(name,age,contact,empid,salary);
	this.subject=subject;
	System.out.println("Child member loading");

	
	
}
public void displayT()

{
	displayE();
	System.out.println("subjet "+subject);
}

}
