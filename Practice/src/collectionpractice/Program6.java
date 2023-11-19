package collectionpractice;

import java.util.Comparator;
import java.util.PriorityQueue;

class Person implements Comparable
{
	String name;
	int age;
	double wealth;
	public Person(String name, int age, double wealth)
	{
		this.name=name;
		this.age=age;
		this.wealth=wealth;
	}
	public String toString()
	{
		return "Person[name="+name+",age="+age+",wealth="+wealth+"]";
	}
	public int compareTo(Object o)
	{
		Person pt=(Person)o;
		return pt.age-this.age;
	}
}
class SortOnwealth implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Person pt1=(Person)o1;
		Person pt2=(Person)o2;
		return (int)(pt1.wealth-pt2.wealth);
	}
}


public class Program6 {

	public static void main(String[] args) {
		
		Person p1=new Person("penga",34,1341.123);
		Person p2=new Person("nibba",12,344.43);
		Person p3=new Person("nibbi",24,214.3);
		Person p4=new Person("psyco",67,111.321);
		
		PriorityQueue pq=new PriorityQueue();
		pq.add(p1);
		pq.add(p2);
		pq.add(p3);
		pq.add(p4);
		
		int len=pq.size();
		System.out.println(len);
		for(int i=0;i<len;i++)
		{
			Object ob=pq.poll();
			System.out.println(ob);
		}
		System.out.println(pq.size());
	    
		System.out.println("sort on wealth");
		PriorityQueue pq2=new PriorityQueue(new SortOnwealth());
		pq2.add(p1);
		pq2.add(p2);
		pq2.add(p3);
		pq2.add(p4);
		
		int len2=pq2.size();
		System.out.println(len2);
		for(int i=0;i<len2;i++)
		{
			Object ob=pq2.poll();
			System.out.println(ob);
		}
		System.out.println(pq2.size());
		
	
	}
	

}
