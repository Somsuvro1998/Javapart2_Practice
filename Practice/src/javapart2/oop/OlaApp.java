package javapart2.oop;

public class OlaApp {

	public static void main(String[] args) {
	Ola ob1=new Mini();
	ob1.Welcome();
	ob1.ride();
	Mini a =(Mini)ob1;
	a.rateDisplay();
	Ola ob2=new Auto();
	ob2.Welcome();
	ob2.ride();
	Auto b=(Auto)ob2;
	b.ratePrint();// TODO Auto-generated method stub

	}

}
