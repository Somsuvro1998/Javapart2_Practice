package javapart2.oop;
import java.util.Scanner;
public class Array5 {
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter 1st array length4");
	int n=sc.nextInt();
	int x[]=new int[n];
	System.out.println("enter 1st array element");
	for(int i=0;i<n;i++)
	{
		x[i]=sc.nextInt();
	}
	System.out.println("enter 2nd array length");
	int m=sc .nextInt();
	int y[]=new int[m];
	System.out.println("enter 2nd array elements");
	for(int i=0;i<m;i++)
	{
		y[i]=sc.nextInt();
	}
	int ar[]=ZigZag(x,y);
	System.out.println("after merging");
	for(int i=0;i<ar.length;i++)
	{
		System.out.print(ar[i]+" ");
	}
	
}
static int[] ZigZag(int x[],int y[])
{
	int z[]=new int[x.length+y.length];
	int i=0,j=0,k=0;
	while(i<x.length&&j<y.length)
	{
		z[k]=x[i];
		k++;
		z[k]=y[j];
		k++;i++;j++;
	}
	while(i<x.length)
	{
		z[k]=x[i];
		k++;i++;
	}
	while(j<y.length)
	{
		z[k]=y[j];
		k++;j++;
	}
	return z;
}

}
