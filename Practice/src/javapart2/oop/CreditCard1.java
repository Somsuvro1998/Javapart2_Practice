package javapart2.oop;

public class CreditCard1 extends Card1{
	double limit;
	public CreditCard1(long cardno,int cvv,String exp,int pin,double limit)
	{
super(cardno,cvv,exp,pin);
this.limit=limit;
	}
	void payment()
	{
		System.out.println("payment done by credit card, limit will be debited");
	}

}
