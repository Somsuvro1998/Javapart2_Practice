package javapart2.oop;

public class DrinkApp {
	public static void main(String[]args)
	{
		Drink d=new Coffee();
		d.welcome();
		d.ready();
		Coffee c=(Coffee)d;
		c.types();
		Drink d1=new Tea();
		d1.welcome();
		d1.ready();
		Tea t1=(Tea)d1;
		t1.typeT();
		
		
		
		
	}

}
