package libraries;

public class Program13 {
public static void main(String[] args) {
	System.out.println("the start....");
	try
	{
		System.out.println("inside try block");
		//int a=1/0;
		throw new ArithmeticException();
	}
	catch(ArithmeticException ref)
	{
		System.out.println("exception occured and handled");
	}
	System.out.println("the end...");
	
	
}
}
