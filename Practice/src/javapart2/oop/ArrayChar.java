package javapart2.oop;
import java.util.Scanner;
public class ArrayChar {

	public static void main(String[] args) {
		char c[]=new char[10];
		Scanner s=new Scanner(System.in);
		System.out.print("Enter 10 char values");
		for(int i=0;i<10;i++);
		{
			c[i]=s.next().charAt(0);
			
		}
		System.out.print("printing ascii values");
		for(int i=0;i<10;i++)
		{
			int value=c[i];
			System.out.print(value);
		}

	}

}
