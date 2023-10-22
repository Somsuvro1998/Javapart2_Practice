package javapart2.oop;
import java.util.Scanner;
public class Account {
private int pin;
private double balance;
private long contact;
long acno;
public Account(long acno,long contact,double balance,int pin)
{
	this.acno=acno;
	this.contact=contact;
	this.balance=balance;
	this.pin=pin;
}
public void setPin()
{
	System.out.println("enter the old pin");
	Scanner s=new Scanner(System.in);
	int p=s.nextInt();
if(pin==p)
{
	System.out.println("Enter your new pin");
	pin=s.nextInt();
	System.out.println("your pin has been updated");
	
}
else
{
	System.out.println("you have entered wrong pin");
}
}
}
