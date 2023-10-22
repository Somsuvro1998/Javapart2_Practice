package javapart2.oop;
import java.util.Scanner;
public class ArrayDynamicInput {

	public static void main(String[] args) {
int b[]=new int[10];
Scanner s=new Scanner(System.in);
System.out.println("enter 10 digits");
for(int i=0;i<10;i++)
{
	b[i]=s.nextInt();
}
System.out.println("Printing elements by multiplying by 2");
for(int i=0;i<10;i++)
{
	System.out.println(b[i]*2);
}
	}

}
