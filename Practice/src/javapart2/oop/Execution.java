package javapart2.oop;

public class Execution {

public static void main(String[] args) 
{
Child.print();
Parent.print();
Parent a=new Parent();
a.print();
Child b=new Child();
b.print();
Parent ob=new Child();
ob.print();

}

}
