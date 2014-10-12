package edu.eetac.upc.dxat.mgasull.CheckingJUnit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ComplexOperations m = new ComplexOperations();
        System.out.println( "Hello World!" );
        double result=m.Power(2,4);
        System.out.println(m.ToDegrees(3.14));
    }
}
