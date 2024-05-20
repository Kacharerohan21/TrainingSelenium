package TrainingSelenium.TrainingSelenium;

import org.testng.annotations.Test;

public class TestNGfeatures {
	@Test
	public void loginTest()
	{
		System.out.println("Login Test");
		int i=9;
	}
	
	@Test(dependsOnMethods="loginTest")
	public void HomepageTest(){
		System.out.print("Home Page Test");
		
	}
	@Test(dependsOnMethods="loginTest")
	public void SearchpageTest()
	{
		System.out.println("Search Page Test");
	}

}
