package javapart2.oop;

public class Students extends Person {
	int id;
	public Students(String name,int age,int id)
	{
		super(name,age);
		this.id=id;
		System.out.println("child executing");
	}
	public void details()
	{
		System.out.println("Name "+name);
		System.out.println("Age "+age);
		System.out.println("id "+id);
	}
	

}
