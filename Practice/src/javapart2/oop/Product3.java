package javapart2.oop;

public class Product3 {
	int pid;
	String brand;
	float price;
	public Product3(int pid,String brand,float price)
	{
		this.pid=pid;
		this.brand=brand;
		this.price=price;
	}

	
	public boolean equals(Product3 ob)
	{
		if(this.brand.equals(ob.brand)) //calling String class equals() method
		return true;
		else
			return false;
	}

	public static void main(String []args)
	{
		Product3 p1=new Product3(701,"Nestle",250f);
		Product3 p2=new Product3(705,"Pilgrim",379f);
		Product3 p3=new Product3(701,"Nestle",45f);
		
		System.out.println(p1.equals(p2));  //false
		System.out.println(p1.equals(p3));   //true because Nestle equals to Nestle
	
	}
}