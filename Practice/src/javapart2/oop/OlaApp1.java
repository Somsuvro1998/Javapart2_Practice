package javapart2.oop;

public class OlaApp1 {
	public static void book(Ola1 ob)
	{
		ob.Welcome();
		ob.ride();
		if(ob instanceof Auto1)
		{
			Auto1 x=(Auto1)ob;
			x.rateA();
		}
		Mini1 y=(Mini1)ob;
		y.rateM();
	}


public static void main(String[]args)
{
	Auto a=new Auto();
	book(a);
	Mini1 m=new Mini1();
	book(m);

	
		
	}


}