package TestNG;

import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestNG_BeforeClassAnnotation {

	@BeforeClass
	public void TestBeforeClass() {
		System.out.println("Running Test -> Before class");
	}

	@AfterClass
	public void Test_AfterClass() {
		System.out.println("Running Test -> After Class");
	}

	@BeforeMethod
	public void Test_BeforeMethod() {
		System.out.println("Running Test -> BeforeMethod");
	}

	@AfterMethod
	public void Test_AfterMethod() {
		System.out.println("The test run -> After the Method");
	}

	@Test
	public void test1() {
		System.out.println("Running test -> TestMethod_1");
	}

	@Test
	public void test2() {
		System.out.println("Running test -> TestMethod_2");
	}

}
