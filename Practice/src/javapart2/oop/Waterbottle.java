package javapart2.oop;

public class Waterbottle {
	String brand;
	String material;
	int capacity;
	float price;
	public Waterbottle(String brand,String material,int capacity,float price)
	{
		this(brand,material,price);
		this.capacity=capacity;
		
	}
	public Waterbottle(String brand,String material,float price)
	{
		this(brand,price);
		this.material=material;
		
	}
	public Waterbottle(String brand,float price)
	{
	this.brand=brand;
	this.price=price;
	}
	public void view()
	{
		System.out.println("brand is "+brand);
		System.out.println("material is "+material);
		System.out.println("capacity is "+capacity);
		System.out.println("price is "+price);
	}

}
