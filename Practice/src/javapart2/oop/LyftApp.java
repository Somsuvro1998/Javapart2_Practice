package javapart2.oop;

public class LyftApp {
	public static void book(Lyft ob)
	{
		ob.welcome();
		ob.ride();
		if(ob instanceof Sedan)
		{
			Sedan x=(Sedan)ob;
			x.rateS();
		}
	
	else
	{
		Limo y=(Limo)ob;
				y.rateL();
	}
	}
	

	public static void main(String[] args) {
Sedan a=new Sedan();
book(a);
Limo m=new Limo();
book(m);

	}

}
