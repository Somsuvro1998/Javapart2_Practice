package libraries;

public class Program21 {

	public static void main(String[] args) {
Student[]data=new Student[4];
data[0]=new Student("Jhon",2345542,"java@gmail",1);
data[1]=new Student("ram",235442,"test@gmail",2);
data[2]=new Student("sam",452342,"dev@gmail",3);
data[3]=new Student("som",9452342,"sql@gmail",4);
	for(int i=0;i<data.length;i++)
		{
		System.out.println(data[i]);
		}
		
	
	}
	

}
