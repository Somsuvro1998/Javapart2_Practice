package libraries;

class Student {
String name;
long contact;
String emailid;
int ratings;
public Student(String name,long contact, String emailid, int ratings)
{
	this.name=name;
	this.contact=contact;
	this.emailid=emailid;
	this.ratings=ratings;
	
}
public String toString()
{
	return name+" "+contact+" "+emailid+" "+ratings;           
	
	
	
}

}
