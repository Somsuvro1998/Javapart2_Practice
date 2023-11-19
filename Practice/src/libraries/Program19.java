package libraries;

public class Program19 {

	public static void main(String[] args) {
int [] ar;
ar=new int[5];
ar[1]=12;
ar[3]=13;
ar[0]=45;
ar[2]=74;
ar[4]=13;

int element=73;
int count=0;

for(int i=0;i<ar.length;i++)
{
	if(ar[i]==element)
	{
		count++;
		break;
		
	}
	if(count!=0)
	{
		System.out.println("element present ");
	}
	else
	{
		System.out.println("element not present");
	}
}
	}

}
