package TrainingSelenium.TrainingSelenium;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junit_introdution {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("This executed Before Class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("This executed After Class");

	}

	@Before
	public void setUp() throws Exception {
		System.out.println("This executed Before");

	}

	@After
	public void tearDown() throws Exception {
		System.out.println("This executed After");

	}

	@Test
	public void test() {
		System.out.println("This executed Test1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("This executed test2");

	}

}
