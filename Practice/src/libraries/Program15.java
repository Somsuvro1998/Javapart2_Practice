package libraries;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Program15 {
public static void main(String[] args) {
	System.out.println("check the weather");
	Department dp=new Department();
	try
	{
		dp.forecast();
	}
	catch(FileNotFoundException e)
	{
		System.out.println("it is raining carry an Umbrella");
	}
	catch(IOException e)
	{
		System.out.println("it is raining carry an Umbrella");
	}
	catch(InterruptedException e)
	{
		e.printStackTrace();
	}	
	
}
}
