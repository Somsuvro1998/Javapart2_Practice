package javapart2.oop;
import java.util.Scanner;

public class Array8 {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int x[]=new int[m];
		for(int i=0;i<m;i++)
		{
			x[i]=sc.nextInt();
		}
	System.out.println("enter the nth value ");
	int n=sc.nextInt();
	for(int i=0;i<x.length;i++)
	{
		int c=0;
		for(int j=0;j<x.length;j++)
		{
	if(x[i]>x[j])
				c++;
		}
		if(c==x.length-n)
			System.out.println(x[i]+" ");
	}
	}

}
