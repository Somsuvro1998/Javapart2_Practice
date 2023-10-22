package javapart2.oop;

public class R implements P,Q {
	public void print()
	{
		System.out.println("First");
		
	}
	void display()
	{
		System.out.println("Second");
	}
	public static void main(String[]args)
	{
		R ob=new R();
		ob.print();
		ob.display();
	}

}
