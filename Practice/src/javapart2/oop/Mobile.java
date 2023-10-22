package javapart2.oop;

public class Mobile


{
	String brand;
	double price;
	public Mobile(String brand,double price)
	{
		this.brand=brand;
		this.price=price;
		
		
	}
	public String toString()
	{
		return brand+" "+price;
	}

public static void main(String[] args) {
Object ob[]=new Object[5];
Mobile m1=new Mobile("Vivo",22000d);
Mobile m2=new Mobile("Nokia",15000d);
Mobile m3=new Mobile("Oppooo",25000d);
Mobile m4=new Mobile("Apple",50000d);
Mobile m5=new Mobile("Oppo",15000d);

ob[0]=m1;
ob[1]=m2;
ob[2]=m3;
ob[3]=m4;
ob[4]=m5;
 for(int i=0;i<5;i++)
 {
	 System.out.println(ob[i]);
 }
	




	}


}





