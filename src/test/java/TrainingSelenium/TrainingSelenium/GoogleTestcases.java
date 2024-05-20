package TrainingSelenium.TrainingSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTestcases {
	WebDriver driver;
	@BeforeTest
	public void Setups()
	{
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
	@Test 
	public void googleTitle()
	{
		String title=driver.getTitle();
		System.out.println(title);
	}
	@Test
	public void googlelogo()
	{
		
	}
	
}
