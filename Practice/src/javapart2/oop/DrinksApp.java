package javapart2.oop;

public class DrinksApp {

	public static void main(String[] args) {
Drinks d=new Cuppacino();
d.welcome();
d.ready();
Cuppacino c=(Cuppacino)d;
c.typesC();
Drinks d1=new Chai();
d1.welcome();
d1.ready();
Chai t=(Chai)d1;
t.typeT();
	}

}
