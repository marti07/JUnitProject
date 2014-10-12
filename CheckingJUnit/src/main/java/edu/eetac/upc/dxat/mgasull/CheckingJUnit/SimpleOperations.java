package edu.eetac.upc.dxat.mgasull.CheckingJUnit;

public class SimpleOperations {

	public int suma(int x, int y){		
		// the following is just an example
	    if (x > 999) {
	      throw new IllegalArgumentException("X should be less than 1000");
	    }	    
		return x + y;
	}
	
	public int resta(int x, int y){
		// the following is just an example
	    if (x > 999) {
		      throw new IllegalArgumentException("X should be less than 1000");
		    }	    
		return x - y;
	}
	
	public int product(int x, int y){
		// the following is just an example
	    if (x > 999) {
	      throw new IllegalArgumentException("X should be less than 1000");
	    }	    
		return x * y;
	}
	
	public int div(int x, int y){
		// the following is just an example
	    if (x > 999) {
	      throw new IllegalArgumentException("X should be less than 1000");
	    }	    
		return x / y;
	}
}
