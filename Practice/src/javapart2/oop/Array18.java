package javapart2.oop;
import java.util.Scanner;
public class Array18 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter String");
		String st=sc.nextLine();
		
		char ch[]=st.toCharArray();
		int f=0;
	for(int i=0;i<ch.length;i++)
	{
		if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
		{
			f=i;
		}
		else if(i==ch.length-1&&ch[i]!=' '||ch[i]!=' '&&ch[i+1]==' ')
		{
			char temp=ch[i];
			ch[i]=ch[f];
			ch[f]=temp;
		}
	}
	System.out.println("after swapping");
	st=new String(ch);
	System.out.println(st);
	}
}
