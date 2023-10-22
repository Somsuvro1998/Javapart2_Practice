package javapart2.oop;
import java.util.Scanner;
public class Array11 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter String");
String st=sc.nextLine();
char ch[]=st.toCharArray();
for(int i=0;i<ch.length;i++)
{
	if(ch[i]>='A'&&ch[i]<='Z')
		ch[i]=(char)(ch[i]+32);
}
System.out.println("after converting ");
st=new String(ch);
System.out.println(st);

	}

}
