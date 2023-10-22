package javapart2.oop;

public class MethodOverEx {
public static void add()
{
	System.out.println(10+20);
	
}
public static void add(int a)
{
	System.out.println(a+100);
	System.out.println("One");
	
	
}
public static void add(int a,int b)
{
	System.out.println(a+b);
	System.out.println("Three");
}
	public static void main(String[] args) {
add(150);
add();
add(400,600);
add(75);
	}

}
