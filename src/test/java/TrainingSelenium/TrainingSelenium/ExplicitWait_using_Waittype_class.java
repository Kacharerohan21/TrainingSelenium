package TrainingSelenium.TrainingSelenium;

import static org.junit.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import Basic.WaitTypes;

public class ExplicitWait_using_Waittype_class {
	private WebDriver driver;
	WaitTypes wt;
	
	// Add the WaitType class here 
	// Please check the if "WaitType" class is delete then program is not executable 

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
	}

	@Test
	public void test() {
		driver.findElement(By.className("dynamic-link")).click();
		driver.navigate().to("https://www.letskodeit.com/login");
		WebElement emailfield=wt.waitForElement(By.id("email"), 10);
		emailfield.sendKeys("Text");
		
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}
