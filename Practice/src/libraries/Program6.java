package libraries;

public class Program6 {

	public static void main(String[] args) {
String s1="Developer";
System.out.println("s1="+s1);
int ans=s1.length();
System.out.println(ans);
char c1=s1.charAt(2);
System.out.println(c1);
String r1=s1.toUpperCase();
System.out.println("s1="+s1);
System.out.println("r1="+r1);
String r2=s1.toLowerCase();
System.out.println("s1="+s1);
System.out.println("r2="+r2);
int num1=s1.indexOf('e');
System.out.println(num1);
int num2=s1.indexOf('e',4);
System.out.println(num2);
String r3=s1.substring(2);
System.out.println(r3);
String r4=s1.substring(2,6);
System.out.println(r4);

	}

}
