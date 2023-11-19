package collectionpractice;

class OwnThread implements Runnable
{
	public void run()
	{
		for(int i=5;i>=1; i--)
		{
			System.out.println("i="+i);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
	
}


public class Program17 {
	public static void main(String[] args) {
		
		
		System.out.println("main method starts...");
		OwnThread ot1=new OwnThread();
		Thread t1=new Thread(ot1);
		t1.start();
		OwnThread ot2=new OwnThread();
		Thread t2=new Thread(ot2);
		t2.start();
		System.out.println("main method end...");
		
	}

}
