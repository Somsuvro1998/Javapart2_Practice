package collectionpractice;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Program14 {

	public static void main(String[] args) {
try
{
	FileInputStream fin=new FileInputStream("C:\\Users\\SOMSUVRO\\Desktop\\New folder\\adhar.txt");
	ObjectInputStream in=new ObjectInputStream(fin);
	Object ob=in.readObject();
	System.out.println(ob);
}
catch(Exception e)
{
	
	e.printStackTrace();
	
	
}		
}
}
