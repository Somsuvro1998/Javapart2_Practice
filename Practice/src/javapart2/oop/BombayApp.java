package javapart2.oop;

public class BombayApp {
	public static void register(PeopleOfBombay ob)
	{
		ob.display();
		if(ob instanceof Pupil)
		{
			Pupil k=(Pupil)ob;
			k.detailsP();
		}
		else
		{
			Worker e=(Worker)ob;
			e.detailsW();
		}
		
	}

	public static void main(String[] args) {
Pupil m=new Pupil("Alex",24,1235468742l,"2025","Arg");
register(m);
Worker n=new Worker("tina",24,745123546l,"2026","manager");
	register(n);
	}

}
