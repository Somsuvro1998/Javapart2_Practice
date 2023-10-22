package javapart2.oop;

public class MoneySwipingMachine {


public static void Swipe(Card ob)
{
ob.payment();
if(ob instanceof DC)
{
	DC d=(DC)ob; 
	d.displayDebit();
}
else
{	CC c=((CC))ob;
c.displayCredit();
}
}
public static void main(String[]args)
{
	CC x=new CC();
	Swipe(x);
	DC y=new DC();
	Swipe(y);
}

}
