package TestNG;

import org.junit.Test;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class TestNG_SoftAsserts {

	@Test
	public void testAdd() {
		SoftAssert sa = new SoftAssert();
		System.out.println("Running the Test -> testAdd");
		SomeClassToTest obj = new SomeClassToTest();
		int result = obj.sumNumbers(1, 2);
		sa.assertEquals(result, 1);
		System.out.println("Line assert 1 : ");
		sa.assertEquals(result, 3);
		System.out.println("Line assert 2 : ");
		sa.assertAll();
	}

}
