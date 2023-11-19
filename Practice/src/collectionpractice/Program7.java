package collectionpractice;

import java.util.ArrayList;
class Cricketer
{
	
}
public class Program7 {

	public static void main(String[] args) {
ArrayList<Choclate> al=new ArrayList();
al.add(new Cricketer());
al.add(new Biscuit("parle-g",20));
al.add(new Choclate("silk",50));
al.add(new Maggie(20,12));
al.add(new Biscuit("parle-g",20));
for(Choclate ob:al)
{
	System.out.println(ob);
	
}

	}

}
