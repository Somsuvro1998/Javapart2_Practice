package javapart2.oop;

public class HaircareProduct extends Person1 {
String catagory;
public HaircareProduct(String brand,double price,int quantity,String catagory)
{
	super(brand,price,quantity);
	this.catagory=catagory;
	
	
	
}
public void display()
{
	System.out.println(catagory);
}
}
