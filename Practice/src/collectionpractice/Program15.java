package collectionpractice;

class MyThread extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("i="+i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}



public class Program15 {

	public static void main(String[] args) {
		
		
		System.out.println("i am main Thread");
		MyThread t1=new MyThread();
		t1.start();
		MyThread t2=new MyThread();
		t2.start();
		System.out.println("the end....");
		

	}

}
