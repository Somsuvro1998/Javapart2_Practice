package javapart2.oop;

public class Bike extends Vehicle {
String colour;
int cc;
public Bike(String company,String model,double price,String colour,int cc)
{
	super(company,model,price);
	this.colour=colour;
	this.cc=cc;
}
public void detailsVb()
{
	System.out.println(colour);
	System.out.println(cc);
}
}
