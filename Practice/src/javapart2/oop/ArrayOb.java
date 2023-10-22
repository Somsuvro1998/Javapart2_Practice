package javapart2.oop;

public class ArrayOb {

	public static void main(String[] args) {
Object ob[]=new Object[5];
Student s1=new Student("Alex",20,6323125419l,"Abc123","Btech");
Student s2=new Student("Sam",20,3362312545l,"Abc234","Btech");
Employee e1=new Employee("Amir",20,45123612846l,"Abc456","Clerk");
Employee e2=new Employee("Alok",20,65623123542l,"Abc987","Clerk");
Employee e3=new Employee("Samir",20,25123215812l,"Abc965","Clerk");
ob[0]=s1;
ob[1]=s2;
ob[2]=e1;
ob[3]=e2;
ob[4]=e3;
for(int i=0;i<5;i++)
{
	System.out.println(ob[i]);
}

	}

}
