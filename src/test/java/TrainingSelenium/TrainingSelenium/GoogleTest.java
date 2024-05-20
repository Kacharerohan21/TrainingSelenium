package TrainingSelenium.TrainingSelenium;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTest {
	WebDriver driver;
	@BeforeTest
	public void Setup()
	{
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		//
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}
	
	@Test
	public void GoogleTitleTest()
	{
		String title =driver.getTitle();
		System.out.println(title);
	}
	
	
	 @AfterTest
	 
	public void tearDown()
	{
	driver.close();	
	}
	

}
