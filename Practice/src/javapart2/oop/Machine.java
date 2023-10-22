package javapart2.oop;

public class Machine {

	public static void main(String[] args) {
Led b=new Led();
b.switchOn();
b.switchOff();
b.welcome();
Iron i=new Iron();
i.switchOn();
i.switchOff();
i.welcome();
//Elecswitch e=new Elecswitch(); (abstract class cannot create an object of its own)
//e.welcome();
	
	}

}
