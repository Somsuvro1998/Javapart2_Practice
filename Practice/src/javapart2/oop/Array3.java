package javapart2.oop;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array length");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("enter array elememts");
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<ar.length;i++)
		{
			boolean rs=isPrime(ar[i]);
			if(rs==true)
				count++;
		}
		System.out.println(count);
	}
static boolean isPrime(int n)
{
	int c=0;
	for(int i=1;i<=n;i++)
	{
		if(n%i==0)
			c++;
	}
return c==2;
	}

}
