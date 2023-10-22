package javapart2.oop;
import java.util.Scanner;
public class Array7 {

	public static void main(String[] args) {
Object obj[]= {"abc",'A',25.05,10,7,5,10};
int x[]=new int[obj.length],y=0;
for(int i=0;i<obj.length;i++)
{
	if(obj[i] instanceof Integer)
		x[y]=(int)obj[i];
	y++;
}
int sum=0;
for(int i=0;i<x.length;i++)
{
	int c=0;
	for(int j=0;j<x.length;j++)
	{
		if(x[i]==x[j])
			c++;
	}
	if(c==1)
	sum=sum+x[i];
	

}
System.out.println("sum of unique elements is "+sum);
	
	}

} 
