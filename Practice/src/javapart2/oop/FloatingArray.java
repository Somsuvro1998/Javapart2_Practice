package javapart2.oop;
import java.util.Scanner;
public class FloatingArray {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the size of the array");
int n=s.nextInt();
float a[]=new float[n];
System.out.println("enter"+n+"float values");
for(int i=0;i<n;i++)
{
	a[i]=s.nextFloat();
	}
System.out.println("printing array element in recerse order");
for(int i=n-1;i>=0;i--)
{
	System.out.println(a[i]);
}
	}

}
