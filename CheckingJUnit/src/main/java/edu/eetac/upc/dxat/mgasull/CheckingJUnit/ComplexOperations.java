package edu.eetac.upc.dxat.mgasull.CheckingJUnit;

public class ComplexOperations {
	
	public double Sqrt(int x){
		return Math.sqrt(x);
	}
	
	public double Power(double x, double y){
		return Math.pow(x,  y);
	}

	public double Log10(int x){
		return Math.log10(x);
	}
	
	public double ToDegrees(double x){
		if(0 < x && x < 2*Math.PI)
			throw new IllegalArgumentException("X should be beteen 0 and 2PI");		
		return Math.toDegrees(x);
	}
	
	public double ToRadians(double x){
		if(0 < x && x < 360)	
			throw new IllegalArgumentException("X should be between 0 and 360");
		return Math.toRadians(x);
	}
}
