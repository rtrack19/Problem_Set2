package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		MyInteger test1= new MyInteger(13);
		assertEquals(test1.isEven(),false);
		assertEquals(test1.isOdd(),true);
		assertEquals(test1.isPrime(),true);
		assertEquals(MyInteger.isEven(10),true);
		assertEquals(MyInteger.isOdd(10),false);
		assertEquals(MyInteger.isPrime(10),false);
		assertEquals(MyInteger.isEvenMyInteger(),false);
		assertEquals(MyInteger.isOddMyInteger(),true);
		assertEquals(MyInteger.isPrimeMyInteger(),true);
		assertEquals(test1.equals(10),false);
		assertEquals(test1.equalsMyInteger(),true);
		
		
	}

}
