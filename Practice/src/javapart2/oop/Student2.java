package javapart2.oop;

public class Student2 {

	int id;
	String name;
	float perc;
	public Student2(String name,int id,float perc)
	{
		this.name=name;
		this.id=id;
		this.perc=perc;
	}
	public String toString()
	{
		return name+" "+id+" "+perc;
		
	}
	public static void main(String[]args)
	{
		Student2 s1=new Student2("Alex",202,80.5f);
		System.out.println(s1);
		Student2 s2=new Student2("Tina",102,89.36f);
		System.out.println(s2);
		
	}
	

	

}
