package collectionpractice;

import java.io.File;
import java.io.IOException;

public class Program11 {

	public static void main(String[] args) {

		File f1=new File("C:\\Users\\SOMSUVRO\\Desktop\\New folder\\Shalom.txt");
		try {
			boolean res=f1.createNewFile();
			System.out.println("file created="+res);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
