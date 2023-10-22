package javapart2.oop;

public class J extends K{
	private void print()
	{
		System.out.println("Hi from child");
	}

	public static void main(String[] args) {
J ob=new J();
ob.print();

K up=new J();//upcasting
up.print();

	}

}
