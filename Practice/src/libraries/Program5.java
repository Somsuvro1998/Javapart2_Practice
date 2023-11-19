package libraries;

public class Program5 {
 
	public static void main(String[] args) {
		String s1="java";
		System.out.println("s1="+s1);
		
		String s2=new String("java");
		System.out.println("s2="+s1);
		
		String s3="java";
		System.out.println("s3="+s3);
		
		System.out.println(s1==s3);
		
		String s4=new String("java");
		System.out.println("s24="+s4);
		
		System.out.println(s2==s4);
		System.out.println(s1==s2);
		//an object cannot be equal to a variable
}
}
