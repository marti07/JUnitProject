package edu.eetac.upc.dxat.mgasull.CheckingJUnit;

import org.junit.Test;

public class OtherPropertiesTest {

	@Test(timeout=100)
	public void testDelay() {
		OtherProperties  op = new OtherProperties();
		op.Delay();
	}

}
