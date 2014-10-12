package edu.eetac.upc.dxat.mgasull.CheckingJUnit;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.After;

import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimpleOperationsTest {

	SimpleOperations math;
	
	@BeforeClass
	public static void initclass()
	{
		System.out.println("BeforeClass");
	}
	
	@Before 
	public void init()
	{
		math = new SimpleOperations();
		System.out.println("Before");
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testSumaExceptionExpected() { 
		//SimpleOperations math = new SimpleOperations();
		System.out.println("sumaException");
		math.suma(1000,  0);
	}
	
	@Test
	public void testSuma() { 
		//SimpleOperations math = new SimpleOperations();
		assertEquals(15, math.suma(10, 5));
		System.out.println("suma");
	}

	@Test
	public void testResta() {
		//SimpleOperations math = new SimpleOperations();
		assertEquals(5, math.resta(10, 5));
		System.out.println("resta");
	}

	@Test
	public void testProduct() {
		//SimpleOperations math = new SimpleOperations();
		assertEquals(50, math.product(10, 5));
		System.out.println("product");
	}

	@Test
	public void testDiv() {
		//SimpleOperations math = new SimpleOperations();
		assertEquals(2, math.div(10, 5));
		System.out.println("div");
	}
	
	@After
	public void After()
	{		
		System.out.println("After");
	}
	

}
