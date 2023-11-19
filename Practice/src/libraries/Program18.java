package libraries;

public class Program18 {

	public static void main(String[] args) {
		int [] ratings;
		ratings=new int[4];
		ratings[1]=2;
		ratings[3]=1;
		ratings[0]=5;
		ratings[2]=4;
		int sum=0;
		for(int i=0; i<ratings.length;i++)
		{
			System.out.println(ratings[i]);
			sum=sum+ratings[i];
		}
		System.out.println("sum="+sum);

	}

}
