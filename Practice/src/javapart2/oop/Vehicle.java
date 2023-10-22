package javapart2.oop;

public class Vehicle {
String company;
String model;
double price;
public Vehicle(String comapany,String model,double price)
{
    this.company=company;
	this.model=model;
	this.price=price;
}

public void detailsV()
{
	System.out.println(company);
	System.out.println(model);
	System.out.println(price);
}
}
