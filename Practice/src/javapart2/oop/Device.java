package javapart2.oop;

public class Device {

	public static void main(String[] args) {
		Eswitch e=new Bulb();
		e.switchOn();
		e.switchOff();
		Eswitch i=new IronBox();
		i.switchOn();
		i.switchOff();
	}

}
