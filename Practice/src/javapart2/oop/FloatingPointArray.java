package javapart2.oop;
import java.util.Scanner;
public class FloatingPointArray {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter the size of the array");
int n=s.nextInt();
float a[]=new float[n];
System.out.println("Enter "+n+" float values");
for(int i=0;i<n;i++)
{
	a[i]=s.nextFloat();
	
}
System.out.println("Printing array elements in reverse order");
for(int i=n=1;i>=0;i--)
{
	System.out.println(a[i]);
}
	}

}
