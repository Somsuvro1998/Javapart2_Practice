package javapart2.oop;

public class Product2 {
	int pid;
	String brand;
	float price;
	public Product2(int pid,String brand,float price)
	{
		this.pid=pid;
		this.brand=brand;
		this.price=price;
	}

	
	public boolean equals(Product2 ob)
	{
		if(this.pid==ob.pid)
		return true;
		else
			return false;
	}

	public static void main(String []args)
	{
		Product2 p1=new Product2(701,"Nestle",250f);
		Product2 p2=new Product2(705,"Pilgrim",379f);
		Product2 p3=new Product2(701,"unilever",45f);
		
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		System.out.println(p3.equals(p2));
	}
}