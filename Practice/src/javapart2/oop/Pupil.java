package javapart2.oop;

public class Pupil extends  PeopleOfBombay{
	String pid;
	String degree;
	public Pupil(String name,int age,long contact,String sid,String degree)
	{
		super(name,age,contact);
		this.pid=pid;
		this.degree=degree;
	}
public void display()
{
	System.out.println("I am a student of Bombay");
}
public void detailsP()
{
	System.out.println("name of Pupil "+name);
	System.out.println("age of Pupil "+age);
	System.out.println("contact of Pupil "+contact);
	System.out.println("pid of pupil "+pid);
	System.out.println("degree of of the pupil "+degree);
}
}
