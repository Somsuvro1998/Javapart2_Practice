package javapart2.oop;

public class PeopleOfBangalore {
String name;
int age;
long contact;
static String district="Bangalore";
public PeopleOfBangalore(String name,int age,long contact)
{
	this.name=name;
	this.age=age;
	this.contact=contact;
}
public void display()
{
	System.out.println("Bangalore resident");
}
}
