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

public class SwitchWindow_1 {

	WebDriver driver=new ChromeDriver();
	
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
	public void test() throws Exception{
		String Paranthandle=driver.getWindowHandle();
		System.out.println("Parant Window : " +Paranthandle);
		
		WebElement openTab=driver.findElement(By.id("opentab"));
		openTab.click();
		
		Set<String> handles=driver.getWindowHandles();
		for(String handle : handles)
		System.out.println(handle);
		if(!handles.equals(Paranthandle))
		{
		System.out.println("The Parant window in eqaul....");	
		}
		else
		{
			// in this line we get the error msg
			//driver.switchTo().window(handle);
			Thread.sleep(2000);
			driver.findElement(By.id("search")).sendKeys("Selenium");
	
		}
	}

}
