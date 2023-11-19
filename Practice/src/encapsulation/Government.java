package encapsulation;

public class Government {

	public static void main(String[] args) {
NetajiFiles file1=new NetajiFiles("kolkata",1957,45);
String loc=file1.getLocation();
System.out.println(loc);
int y=file1.getYod();
System.out.println(y);
int t=file1.gettotal();
System.out.println(t);

file1.setLocation("japan");
file1.setyear(1979);
file1.settotal(2900);

String loc2=file1.getLocation();
System.out.println(loc2);
int y2=file1.getYod();
System.out.println(y2);
int t2=file1.gettotal();
System.out.println(t2);
	
	}

}
