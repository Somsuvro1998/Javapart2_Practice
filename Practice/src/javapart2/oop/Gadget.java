
package javapart2.oop;

public class Gadget {
public static void main(String[]args)
{
	Electricswitch e=new Ac(); //upcasting
	e.switchOn();
	Electricswitch i=new Fridge();
	i.switchOn();
	e.switchOff();
	i.switchOff();
}
}
