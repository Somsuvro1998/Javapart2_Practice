package javapart2.oop;

public class ExecuteCET {

	public static void main(String[] args) {
		Candidate c1=new Candidate("John",20,9856471254l);
		c1.displayC();
		System.out.println("_________________________________________________");
Employees e1=new Employees("Tina",25,894562173l,"abc123",20000d);
e1.displayE();
System.out.println("______________________________________________________");
Trainee t1=new Trainee("Som",25,9856471234l,"abc121",800000d,"Core Java");
t1.displayT();

	}

}
