package polymorphism;

public class AnandBhavan implements Zomato{
	public void menu()
	{
		System.out.println("Welcome to Anand Bhavan");
		System.out.println("idli vada sambar");
		System.out.println("---------------------------------");
		}
	public void takeOrder()
	{
		System.out.println("take order from customer and pass order to AnandBhavan");
		System.out.println("----------------------------------");
	}
	public void deliver()
	{
		System.out.println("hand over the parcel from AnandBhavan to delivery person");
		System.out.println("------------------------------------");
	}

}
