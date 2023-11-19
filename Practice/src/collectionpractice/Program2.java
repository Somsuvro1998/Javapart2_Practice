package collectionpractice;

import java.util.ArrayList;
import java.util.LinkedList;



class Biscuit {
String brand;
int cost;
public Biscuit(String brand, int cost)
{
	this.brand=brand;
	this.cost=cost;
}
public String toString()
{
	return "Biscuit [brand=" + brand + ", cost=" +cost +"]";
}

}
class Choclate {

	String flavour;
	int weight;
	public Choclate(String flavour,int weight)
	{
		this.flavour=flavour;
		this.weight=weight;
		
	}
	public String toString()
	{
		return "Choclate [flavour=" + flavour + ",weight=" + weight + "]";
	}
}
class Maggie
{
	int ingredients;
	int cost;
	public Maggie(int ingredients, int cost)
	{
		this.ingredients=ingredients;
		this.cost=cost;
	}
	public String toString()
	{
		return "Maggie [ingredients=" + ingredients + ".cost=" + cost +"]";
	}
}
public class Program2
{
public static void main(String[]args)
{
	//ArrayList a1=new ArrayList();
	LinkedList a1=new LinkedList();
	a1.add(new Biscuit("parle-g", 20));
	a1.add(new Choclate("silk", 50));
	a1.add(new Maggie(20,12));
	a1.add(new Biscuit("parle-g", 20));
	a1.add(new Choclate("silk", 50));
	a1.add(new Maggie(20, 12));
	a1.add(new Biscuit("parle-g", 20));
	a1.add(new Choclate("silk", 50));
	a1.add(new Maggie(20, 12));
	a1.add("java");
	a1.add(new Choclate("almond", 80));
	a1.add(new Choclate("silk", 50));
	a1.add(new Maggie(20, 12));
	a1.add(new Biscuit("parle-g", 20));
	a1.add(new Choclate("silk", 50));
	a1.add(new Maggie(20, 12));
	a1.add(new Maggie(20, 12));
	a1.add(5, "hello");
	a1.add(null);
	System.out.println(a1.size());
	for(int i=0; i<a1.size();i++)
	{
		Object ob=a1.get(i);
		System.out.println(ob);
	}
	System.out.println("+++++++++++++++++++++++++");
	ArrayList a2=new ArrayList(a1);
	System.out.println(a2.size());
	for(int i=0;i<a2.size(); i++)
	{
		Object ob=a2.get(i);
		System.out.println(ob);
	}
	
}
}
