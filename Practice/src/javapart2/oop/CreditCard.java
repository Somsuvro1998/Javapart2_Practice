package javapart2.oop;

public class CreditCard extends Card {
@Override
public void payment() {
	System.out.println("your paymemt is successful using your credit card");
}
public void Credit()
{
	System.out.println("monthly limit is reducing");
	System.out.println("Due is increasing");
}
}
