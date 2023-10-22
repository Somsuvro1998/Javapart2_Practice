package javapart2.oop;
import java.util.Scanner;
public class Array13 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter String");
String st=sc.nextLine();
for(int i=st.length()-1;i>=0;i--)
{
	System.out.print(st.charAt(i));
}
	}

}
