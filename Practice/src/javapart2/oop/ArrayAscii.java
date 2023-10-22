package javapart2.oop;
import java.util.Scanner;
public class ArrayAscii {

	public static void main(String[] args) {
		char c[]=new char[10];
Scanner s=new Scanner(System.in);

System.out.println("Enter 10 characters");
for(int i=0;i<10;i++)
{
	c[i]=s.next().charAt(0);
	}
System.out.println("Printing ascii values");
for(int i=0;i<10;i++)
{
	int value=c[i];
	System.out.println(value);
}

	}

}
