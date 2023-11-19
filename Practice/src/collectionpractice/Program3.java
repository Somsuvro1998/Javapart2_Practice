package collectionpractice;

import java.util.HashSet;
import java.util.Iterator;

public class Program3 {

	public static void main(String[] args) {
HashSet hs=new HashSet();
hs.add("D");
hs.add("A");
hs.add("a");
hs.add("A");

System.out.println(hs.size());
Iterator ref=hs.iterator();
while(ref.hasNext())
{
	Object ob=ref.next();
	System.out.println(ob);
}
	}

}
