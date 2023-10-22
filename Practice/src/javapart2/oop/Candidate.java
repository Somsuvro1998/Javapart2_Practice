package javapart2.oop;

public class Candidate {
String name;
int age;
long contact;
public Candidate(String name,int age,long contact)
{
	this.name=name;
	this.age=age;
	this.contact=contact;
	System.out.println("Grand Parent members loading");
}
public void displayC()
{
	System.out.println("Name "+name);
	System.out.println("age "+age);
	System.out.println("contact "+contact);
	
}
}
