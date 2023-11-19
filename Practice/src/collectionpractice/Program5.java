package collectionpractice;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Movie implements Comparable
{
	String name;
	int rank;
	double budget;
	public Movie(String name, int rank, double budget)
	{
		this.name=name;
		this.rank=rank;
		this.budget=budget;
	}
	public int compareTo(Object o)
	{
		Movie mt=(Movie)o;
		String first=this.name;
		String second=mt.name;
		int value=first.compareTo(second);
		return value;	
	}
	public String toString()
	{
		return "Movie[name="+name+",rank="+rank+",budget="+budget+"]";
	}
}
class SortBasedOnRank implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		Movie mt1=(Movie)o1;
		Movie mt2=(Movie)o2;
		return (int)(mt1.rank-mt2.rank);
	}
}
class SortBasedOnBudget implements Comparator
{
public int compare(Object o1,Object o2 )
{
	Movie mt1=(Movie)o1;
	Movie mt2=(Movie)o2;
	return (int)(mt1.budget-mt2.budget);
}
}



public class Program5 {

	public static void main(String[] args) {

		Movie m1=new Movie("Bahubali",5,289.78);
		Movie m2=new Movie("rrr",4,1009.213);
		Movie m3=new Movie("kgf",1,424.1378);
		Movie m4=new Movie("Jailer",3,213.78);
		TreeSet ts=new TreeSet();
		
		ts.add(m1);
		ts.add(m2);
		ts.add(m3);
		ts.add(m4);
		 
		
		System.out.println(ts.size());
		Iterator ref=ts.iterator();
	while(ref.hasNext())
	{
		Object ob=ref.next();
		System.out.println(ob);
	}
	System.out.println("second tree set");
	TreeSet ts2=new TreeSet(new SortBasedOnRank());
	ts2.add(m1);
	ts2.add(m2);
	ts2.add(m3);
	ts2.add(m4);
	System.out.println(ts2.size());
	Iterator ref2=ts2.iterator();
	while(ref2.hasNext())
	{
		Object ob=ref2.next();
		System.out.println(ob);
	}
	System.out.println("third tree set");
	TreeSet ts3=new TreeSet(new SortBasedOnBudget());
	ts3.add(m1);
	ts3.add(m2);
	ts3.add(m3);
	ts3.add(m4);
	System.out.println(ts3.size());
	Iterator ref3=ts3.iterator();
	while(ref3.hasNext())
	{
		Object ob=ref3.next();
		System.out.println(ob);
	}
		
	
	}

}
