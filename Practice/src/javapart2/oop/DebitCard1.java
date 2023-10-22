package javapart2.oop;

public class DebitCard1 extends Card1{
long balance;
public DebitCard1(long cardno,int cvv,String exp,int pin,long balance)
{
	super(cardno,cvv,exp,pin);
	this.balance=balance;
}
}
