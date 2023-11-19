package encapsulation;
import java.util.Scanner;
public class ProgramScanner2 {
public static void main(String[] args) {
	
	Scanner s=new Scanner(System.in);
	System.out.println("enter second srting");
	String s2=s.nextLine();
	System.out.println("s2="+s2);
	
	System.out.println("enter first string");
	String s1=s.next();
	System.out.println("s1="+s1);
	
}
}
