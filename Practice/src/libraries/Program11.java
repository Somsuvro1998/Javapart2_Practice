package libraries;

public class Program11
{
	public static void main(String[] args) {
		
		System.out.println("this is you decide cm");
		try
		{
			ChiefMinister cm=new ChiefMinister();
			cm.governState();
		}
		catch(ArithmeticException ref)
		{
			System.out.println("I will not vote you next time");
			ref.printStackTrace();
		
	}

	}
}

