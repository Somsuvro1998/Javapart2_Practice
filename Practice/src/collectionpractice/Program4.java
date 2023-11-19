package collectionpractice;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Program4 {

	public static void main(String[] args) {

		LinkedHashSet hs=new LinkedHashSet();
		hs.add("java");
		hs.add("java");
		hs.add("asql");
		hs.add("sql");
		hs.add("web");
		hs.add("testing");
		hs.add("web");
		hs.add("sql");
		hs.add("web");
		hs.add("testing");
		System.out.println(hs.size());
		Iterator ref=hs.iterator();
		while(ref.hasNext())
		{
			Object ob=ref.next();
			System.out.println(ob);
			}
	}

}
