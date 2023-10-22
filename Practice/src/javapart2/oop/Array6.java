package javapart2.oop;
import java.util.Scanner;
public class Array6 {
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter array length");
	int n=sc.nextInt();
	int x[]=new int[n];
	
	System.out.println("enter array elements");
	for(int i=0;i<n;i++)
	{
		x[i]=sc.nextInt();
		
	}
	boolean rs[]=new boolean[x.length];
	for(int i=0;i<x.length;i++)
	{
		int c=1;
		if(rs[i]==false)
		{
			for(int j=i+1;j<x.length;j++)
			{
				if(x[i]==x[j])
				{
					c++;
					rs[j]=true;
				}
			}
			System.out.println(x[i]+" --> "+c);
		}
	}
	
}
}
