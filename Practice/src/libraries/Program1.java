package libraries;

public class Program1  {

	public static void main(String[] args ) {
String [] ar= {"hello","java","sql"};
System.out.println("length="+ar.length);
for(int i=0;i<ar.length;i++)
{
	System.out.println(ar[i]);
}
System.out.println("jvm called method string array");
System.out.println("length="+args.length);
for(int i=0;i<args.length;i++)
{
	System.out.println(args[i]+1);
}
	}

}
