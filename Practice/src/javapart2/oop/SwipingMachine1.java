package javapart2.oop;

public class SwipingMachine1 {

	public static void main(String[] args) {
CreditCard1 c=new CreditCard1(123456789l,123,"12/56",1236,12463563566d);
swipe(c);
DebitCard1 d=new DebitCard1(79900457829l,8151,"12/29",6611,5506565500l);
swipe(d);


	}
	
public static void swipe(Card1 ob)
{
	ob.payment();
}
}
