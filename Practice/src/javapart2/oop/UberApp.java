package javapart2.oop;

public class UberApp {

	public static void main(String[] args) {
Uber ob1=new Micro();
ob1.welcome();
ob1.ride();
Micro a=(Micro)ob1;
a.rateDisplay();
Uber ob2=new XL();
ob2.welcome();
ob2.ride();
XL b=(XL)ob2;
b.ratePrint();

	}

}
