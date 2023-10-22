package javapart2.oop;

public class Program19 {

	public static void main(String[] args) {
int [] ar;
ar=new int[5];
ar[1]=12;
ar[3]=13;
ar[0]=45;
ar[2]=74;
ar[4]=13;
int element=46;
for(int i=0;i<ar.length;i++)
{
	if(ar[i]==element)
	{
		System.out.println("element present");
	}
	else
	{
		System.out.println("element not present");
	}
}
	}

}
