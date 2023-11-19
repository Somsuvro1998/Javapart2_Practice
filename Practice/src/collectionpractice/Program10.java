package collectionpractice;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class AdharCard implements Serializable
{
	String name;
	long adharnumber;
	long contact;
	public AdharCard(String name,long adharnumber,long contact)
	{
		this.name=name;
		this.adharnumber=adharnumber;
		this.contact=contact;	
	}
	public String toString()
	{
		return "AdharCard[name="+name+",adharnumber="+adharnumber+",contact="+contact+"]";
	}		
}

public class Program10 {

public static void main(String[] args) {
 
	AdharCard ac1=new AdharCard("penga",2344234L,312121L);
	try
	{
		FileOutputStream fout=new FileOutputStream("C:\\Users\\SOMSUVRO\\Desktop\\New folder\\adhar.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		out.writeObject(ac1);
		System.out.println("object written");
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	}
}
