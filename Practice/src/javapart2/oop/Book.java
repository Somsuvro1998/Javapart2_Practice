package javapart2.oop;
import java.util.Scanner;
public class Book {
String bname;
private int bookid;
private float price;
Scanner s=new Scanner(System.in);
public Book(String bname,int bookid,float price )
{
	this.bname=bname;
	this.bookid=bookid;
	this.price=price;
	
}
public void getPrice()

{
	System.out.println("enter the id");
	int id=s.nextInt();
	if(bookid==id)
	{
		System.out.println("Price is "+price);
	}
else
{
	System.out.println("wrong id");
}
}
public void setPrice()
{
	System.out.println("enter the id");
	int id=s.nextInt();
	if(bookid==id)
	{
		System.out.println("Enter new price for the book");
		price=s.nextFloat();
		System.out.println("Price updated successfully");
	}
	else
	{
		System.out.println("you have entered wrong id cannot update price");
	}
}
public void getBookid()
{
	System.out.println("Enter Price");
	float p=s.nextFloat();
	if(p==price)
	{
		System.out.println("Book id is "+bookid);
		
	}
	else
	{
		System.out.println("verfication failed");
	}
}
}
