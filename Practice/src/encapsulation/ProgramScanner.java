package encapsulation;
import java.util.Scanner;
public class ProgramScanner {
	
	public static void main(String[] args)

	{
System.out.println("collect datab for mock interview");
System.out.println("enter contact no");
Scanner s=new Scanner(System.in);
long contactno=s.nextLong();
System.out.println("contactno="+contactno);

System.out.println("enter the slot no");
int slot=s.nextInt();
System.out.println("slot="+slot);
	}

}
