package javapart2.oop;
import java.util.Scanner;
public class Array14 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter String");
String st=sc.nextLine();
boolean rs=isPal(st);
if(rs==true)
	System.out.println("It is a pallindrome string");
else
	System.out.println("it is not a pallindrome String");
	}
static boolean isPal(String st)
{
	int i=0;j=st.length()-1;
	while(i<j)
	{
		if(st.charAt(i)!=st.charAt(j))
			return false;
		else
			i++;j--;
	}
	return true;
	}

}
