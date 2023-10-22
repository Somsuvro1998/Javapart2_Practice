package javapart2.oop;

public class Student extends PeopleOfBangalore {
	String sid;
	String degree;
	public Student(String name,int age,long contact,String sid,String degree)
	{
		super(name, age, contact);
		this.sid=sid;
		this.degree=degree;
		}
	public void details()
	{
		System.out.println("name of the Student "+name);
		System.out.println("age of the Student "+age);
		System.out.println("Contact of the Student "+contact);
		System.out.println("sid of the Student "+sid);
		System.out.println("degree of the student "+degree);
		
		
		
	}
	
	}
