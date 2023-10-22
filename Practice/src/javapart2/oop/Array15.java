package javapart2.oop;
import java.util.Scanner;
public class Array15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter String");
		String st=sc.nextLine();
		
		char ch[]=st.toCharArray();
		int c=0;
		for(int i=0;i<ch.length;i++)
		{
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
				c++;
		}
		System.out.println(c);
	}

}
