package edu.eetac.upc.dxat.mgasull.CheckingJUnit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ComplexOperationsTest.class, SimpleOperationsTest.class, OtherPropertiesTest.class })
public class AllTests {
}
