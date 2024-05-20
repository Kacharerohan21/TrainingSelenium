package TrainingSelenium.TrainingSelenium;

import org.testng.annotations.Test;

public class checkfeature {
	
	@Test
	public void LoginTest()
	{
		System.out.println("Login Page");
	}
	@Test(dependsOnMethods="LoginTest")
	public void HomePageTest()
	{
		System.out.println("Home Page");
	}
	

}
