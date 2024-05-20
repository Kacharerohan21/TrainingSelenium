package TestNG;

import org.junit.Test;
import org.testng.Assert;

public class TestNG_Asserts {

	@Test
	public void testSum() {
		System.out.println("Running Test-> TestSum");
		SomeClassToTest obj = new SomeClassToTest();
		int result = obj.sumNumbers(1, 2);
		Assert.assertEquals(result, 3);
	}

	@Test
	public void testString() {
		System.out.println("Running Test -> TestString");
		SomeClassToTest obj = new SomeClassToTest();
		String expectedresult = "Hello World";
		String result = obj.addString("Hello", "World");
		Assert.assertEquals(result, expectedresult);
	}

	@Test
	public void testArray() {
		System.out.println("Running Test -> TestArray");
		SomeClassToTest obj = new SomeClassToTest();
		int[] ExpectedResult = { 1, 2, 3 ,4};
		int[] Result = obj.GetArray();
		Assert.assertEquals(Result, ExpectedResult);
	}

}
