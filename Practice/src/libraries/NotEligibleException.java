package libraries;

public class NotEligibleException extends Exception {
	public NotEligibleException() {
		System.out.println("You have not taken mock interview");
	}
}
class MrDataBase
{
void registration(boolean mockInterview) throws NotEligibleException
{
	if(mockInterview==true)
	{
		System.out.println("proceed with registration");
	}
	else
	{
	throw new NotEligibleException();	
	}
}
}
