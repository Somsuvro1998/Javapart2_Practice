package collectionpractice;

import java.io.FileWriter;
import java.io.IOException;

public class Program12 {

	public static void main(String[] args) {
String password="Data";
String space=" ";
String username="Store";
try
{
	FileWriter fw=new FileWriter("C:\\Users\\SOMSUVRO\\Desktop\\New folder\\data.txt");
	fw.write(password);
	fw.write(space);
	fw.write(username);
	fw.flush();
	System.out.println("data written");
}
catch(IOException e)
{
	e.printStackTrace();
}

	}

}
