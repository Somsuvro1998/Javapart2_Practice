package javapart2.oop;
import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array length");
		int n=sc.nextInt();
		int ar[]=new int [n];
		System.out.println("enter array elements");
		for(int i=0;i<n;i++)
		{
		ar[i]=sc.nextInt();
		}
		int big=ar[0];
		for(int i=1;i<ar.length;i++)
		{
			if(ar[i]>big)
				big=ar[i];
		}
		System.out.println("the biggest element in an array is "+big);
		

	}

}
