package edu.eetac.upc.dxat.mgasull.CheckingJUnit;

public class OtherProperties {
	
	public void Delay()
	{
		try {
		    Thread.sleep(10);                 //1000 milliseconds is one second.
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
	}

}
