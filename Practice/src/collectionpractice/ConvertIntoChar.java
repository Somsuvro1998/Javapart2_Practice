package collectionpractice;

import java.io.FileReader;

public class ConvertIntoChar {

	public static void main(String[] args) {

		 try
		 {
			 FileReader fr=new FileReader("C:\\Users\\SOMSUVRO\\Desktop\\New folder\\Numbers.txt");
			int num=fr.read();
		
			while(num!=-1)
			{
				System.out.println((char)num);
				num=fr.read();
			}
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	}

}

