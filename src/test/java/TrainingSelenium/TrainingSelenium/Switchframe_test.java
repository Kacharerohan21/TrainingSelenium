package TrainingSelenium.TrainingSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Switchframe_test {
	WebDriver driver = new ChromeDriver();

	@Before
	public void setUp() throws Exception {
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	public void test() throws Exception {
		Thread.sleep(2000);
		driver.switchTo().frame("courses-iframe");
		driver.findElement(By.id("search")).sendKeys("selenium");

		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).sendKeys("The data added successfully");
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}
}
