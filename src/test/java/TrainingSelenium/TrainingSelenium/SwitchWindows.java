package TrainingSelenium.TrainingSelenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SwitchWindows {
WebDriver driver =new ChromeDriver();

	@Before
	public void setUp() throws Exception {
	driver.get("https://www.letskodeit.com/practice");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

	@Test
	public void test() {
		String parantHandle=driver.getWindowHandle();
		System.out.println("Parant handle : " +parantHandle);
		
		WebElement openWindow=driver.findElement(By.id("opentab"));
		openWindow.click();
		
		Set<String> handles=driver.getWindowHandles();
		
		for(String handle:handles)
		{
			System.out.println(handle);
		}
	}

}
