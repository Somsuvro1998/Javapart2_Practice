package javapart2.oop;
import java.util.Scanner;
public class Array10 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter String");
String st=sc.nextLine();
int cc=0,vc=0,dc=0,nc=0;
for(int i=0;i<st.length();i++)
{
	char ch=st.charAt(i);
	if(ch=='a'||ch>='a'&&ch<='z')
	{
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			vc++;
		else
			cc++;
	}
	else if(ch>='0'&&ch<='9')
		dc++;
	else
		nc++;
}
System.out.println("consonants are "+cc);
System.out.println("vowels are "+vc);
System.out.println("digits are "+dc);
System.out.println("spcl characters are "+nc);
	}

}
