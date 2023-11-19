package collectionpractice;

public class ForEach {

	public static void main(String[] args) {
int[] numbers= {3,4,5,7,15,20};
int sum=0;

for(int number:numbers)
{
sum+=number;	

}
System.out.println("sum="+sum);
}

}
