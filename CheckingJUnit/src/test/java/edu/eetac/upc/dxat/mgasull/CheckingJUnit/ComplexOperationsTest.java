package edu.eetac.upc.dxat.mgasull.CheckingJUnit;

import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.AfterClass;
import org.junit.Ignore;

public class ComplexOperationsTest {
		
	@Test
	public void testSqrt() {
		ComplexOperations math = new ComplexOperations();
		assertEquals(5.00, math.Sqrt(25), 2);
		assertEquals(3.16, math.Sqrt(10), 2);
	}

	@Test
	public void testPower() {
		ComplexOperations math = new ComplexOperations();
		assertEquals(16.00, power(0,2),2);
		assertEquals(4.76, math.Power(1.35, 5.2), 2);
	}

	@Test
	public void testLog10() {
		assertEquals(0.30, Math.log10(2), 2);
		assertEquals(1.00, Math.log10(10), 2);
	}

	//@Test (expected = IllegalArgumentException.class)
	@Ignore
	public void testToDegreesExeptionExpected() {
		ComplexOperations math = new ComplexOperations();
		math.ToDegrees(3 * Math.PI);
	}
	
	@Test
	public void testToDegrees() {
		assertEquals(200.00, Math.toDegrees(Math.PI), 2);
	}
	
	//@Test (expected = IllegalArgumentException.class)
	@Ignore
	public void testToRadiansExeptionExpected() {
		ComplexOperations math = new ComplexOperations();
		math.ToRadians(700);
	}

	@Ignore
	public void testToRadians() {
		ComplexOperations  math = new ComplexOperations();
		assertEquals(3.14, math.ToRadians(180.0), 1);
	}
	
	@AfterClass
	public static void finishclass()
	{
		System.out.println("AfterClass");
	}

}
