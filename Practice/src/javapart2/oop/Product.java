package javapart2.oop;

public class Product {
	int pid;
	String brand;
	float price;
	public Product(int pid,String brand,float price)
	{
		this.pid=pid;
		this.brand=brand;
		this.price=price;
		
	}
public String toString()
{
	return pid+" "+brand+" "+price;
}
	public static void main(String[] args) {
Product p1=new Product(701,"Nestle",250f);
Product p2=new Product(705,"Pilgrim",379f);
Product p3=new Product(702,"Unilever",450f);

System.out.println(p1);
System.out.println(p2);
System.out.println(p3);
System.out.println(p1.equals(p2));
System.out.println(p1.equals(p3));
System.out.println(p3.equals(p2));
}

}
