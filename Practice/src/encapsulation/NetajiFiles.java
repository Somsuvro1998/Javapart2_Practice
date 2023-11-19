package encapsulation;

public class NetajiFiles {
private String location;
private int yod;
private int total;

public String getLocation()
{
	System.out.println("verify and validate access code");
	return location;
}
public int getYod()
{
	System.out.println("verify and validate access code");
	return yod;
}
public int gettotal()
{
	System.out.println("verify and validate access code");
	return total;
}

public NetajiFiles(String location,int yod,int total)
{
	this.location=location;
	this.yod=yod;
	this.total=total;
}
public void setLocation(String location)
{
	System.out.println("verify and validate access code");
	this.location=location;
	System.out.println("location updated");
}
public void setyear(int yod)
{
	System.out.println("verify and validate access code");
	this.yod=yod;
	System.out.println("year updated");
}
public void settotal(int total)
{
	System.out.println("verify and validate access code");
	this.total=total;
	System.out.println("total updated");
}
}
