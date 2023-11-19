package libraries;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Program9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("hello I am main");
		try
		{
			System.out.println("enter a String");
			String s1=sc.next();
			System.out.println("s1="+s1);
			System.out.println("enter the index");
			int index=sc.nextInt();
			System.out.println(index);
			char ch=s1.charAt(index);
			System.out.println("ch="+ch);
			System.out.println("had coffee..?");
		}
		catch(InputMismatchException ref)
		{
			System.out.println("Input Exception Handled");
			
		}
		catch(StringIndexOutOfBoundsException ref)
		{
			System.out.println("Exception Handled");
		}
	
		catch(Exception ref)
		{
			System.out.println("All exception Handled");
		}
		
		System.out.println("Continue execution");
		System.out.println("the end...");
	}

}
