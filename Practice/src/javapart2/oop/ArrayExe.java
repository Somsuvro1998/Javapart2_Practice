package javapart2.oop;
import java.util.Scanner;
public class ArrayExe {

	public static void main(String[] args) {
String s[]=create();
for(int i=0;i<6;i++)
{
	System.out.println(n[i]);
	
}

}
	public static String[]create()
	{
		Scanner s=new Scanner(System.in);
		String a[]=new String[];
		System.out.println("enter String");
		for(int i=0;i<5;i++)
		{
			a[i]=s.next();
			}
		return a;
		
	}

}
