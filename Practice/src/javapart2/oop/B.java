package javapart2.oop;

public class B extends A{
	private void print()
	{
		System.out.println("Hi from Child");
	}
	public static void main(String[]args)
	{
		B ob=new B();
		ob.print();
		A up=new B();
		up.print();
	}

}
