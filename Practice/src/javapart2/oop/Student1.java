package javapart2.oop;

public class Student1 {
int id;
String name;
float perc;
public Student1(String name,int id,float perc)
{
	this.name=name;
	this.id=id;
	this.perc=perc;

}
public static void main(String[] args) {
Student1 s1=new Student1("Alex",102,67.2f);
Student1 s2=new Student1("Tina",203,71.2f);
System.out.println(s1); //sop(s1.toString())address will be printed for s1
System.out.println(s2); //sop(s2.toString())address will be printed for s2

	}

}
