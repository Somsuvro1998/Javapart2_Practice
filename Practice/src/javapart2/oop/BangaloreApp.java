package javapart2.oop;

public class BangaloreApp {
	public static void register(PeopleOfBangalore ob)
	
	{
		ob.display();
		if(ob instanceof Student)
		{
			Student k=(Student)ob;
					k.details();
		}
		else
		{
			Employee e=(Employee)ob;
			e.detailsE();
		}
			
	}
public static void main(String[]args)
{
	Student m=new Student("Alex",24,55644856,"2025","BERC");
	register(m);
	Employee n=new Employee("Tina",24,654845352,"2052","manager");
	register(n);
	
	
			
}
}
