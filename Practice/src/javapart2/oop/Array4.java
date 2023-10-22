package javapart2.oop;
import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array length");
		int n=-sc.nextInt();
		int ar[]=new int [n];
		System.out.println("enter"+n+"array elements");
		for(int i=0;i<n;i++);
		{
			ar[i]=sc.nextInt();
		}
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]>ar[j])
				{
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
			System.out.println("after sorting in ascending order");
			for(int i=0;i<ar.length;i++)
			{
				System.out.println(ar[i]+" ");
			}
		}
	

	}

}
