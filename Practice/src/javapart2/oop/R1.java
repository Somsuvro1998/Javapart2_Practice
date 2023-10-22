package javapart2.oop;

public class R1 implements P1,Q1 {
	public void print()
	{
		System.out.println("First");
	}
void display()
{
	System.out.println("Second");
}
	public static void main(String[] args) {
R1 ob=new R1();
ob.print();
ob.display();
	}

}
