package javapart2.oop;

class Person1 {
String brand;
double price;
int quantity;
public Person1(String brand,double price,int quantity)
{
	this.brand=brand;
	this.price=price;
	this.quantity=quantity;
}
public void viewProduct()
{
	System.out.println(brand);
	System.out.println(price);
	System.out.println(quantity);
}
}
