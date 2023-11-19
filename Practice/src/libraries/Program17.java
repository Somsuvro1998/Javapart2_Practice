package libraries;

public class Program17 {

	public static void main(String[] args) {
MrDataBase data=new MrDataBase();
try 
{
data.registration(false);	
}
catch(NotEligibleException e)
{
	System.out.println("attend mock and then register");
}

	}

}
