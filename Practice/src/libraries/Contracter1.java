package libraries;

import java.io.IOException;



class Contracter1 {
void roadconstruction() throws IOException
{
	System.out.println("contractor construct the road");
	throw new IOException();
}
}
class Minister1 {

	void development()throws IOException
	{
		System.out.println("minister will do the development");
		Contracter1 ct=new Contracter1();
		ct.roadconstruction();
		
	}
	
}
class ChiefMinister1
{
	void governState() throws IOException
	{
		System.out.println("cm will govern the state...");
		Minister1 m1=new Minister1();
		m1.development();
	}
}


