package libraries;

public class Program7 {

	public static void main(String[] args) {
StringBuilder sb1=new StringBuilder("j");
System.out.println(sb1);
sb1.append("a");
System.out.println(sb1);
sb1.append("v");
System.out.println(sb1);
sb1.append("a");
System.out.println(sb1);
sb1.reverse();
System.out.println(sb1);
StringBuffer s1=new StringBuffer("A");
System.out.println(s1.toString());
System.out.println(s1.hashCode());
StringBuffer s2=new StringBuffer("A");
System.out.println(s2.toString());
System.out.println(s2.hashCode());
System.out.println(s1==s2);
System.out.println(s1.equals(s2));




	}

}
