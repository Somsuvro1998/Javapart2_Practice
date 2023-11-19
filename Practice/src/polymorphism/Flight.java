package polymorphism;

public class Flight implements Rocket,Threewheeler {
	public void fly()
	{
		System.out.println("fly method...");
	}
	public void moveOnGround()
	{
		System.out.println("move on ground method....");
	}

}
