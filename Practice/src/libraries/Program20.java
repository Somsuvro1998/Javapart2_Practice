package libraries;

public class Program20 {

	public static void main(String[] args) {
double[]ar= {3,4,1,5,8,9};
System.out.println(ar.length);
for(int i=0;i<ar.length;i++)
{
	System.out.println(ar[i]);
}
 String s1="testing";
 System.out.println("s1="+s1);
 char [] ch=s1.toCharArray();
 for(int i=0;i<ch.length;i++)
 {
	 System.out.println(ch[i]);
 }
 
 String s2="java is easy we can learn soon";
 String[]str=s2.split(" ");
 for(int i=0; i<str.length;i++)
 {
	 System.out.println(str[i]);
 }
	}

}
