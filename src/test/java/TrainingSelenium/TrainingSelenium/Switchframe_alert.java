package TrainingSelenium.TrainingSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Switchframe_alert {

	WebDriver driver = new ChromeDriver();

	@Before
	public void setUp() throws Exception {
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	public void test1() throws Exception {
		driver.findElement(By.id("name")).sendKeys("Alert");
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	@Test
	public void test2() throws Exception {
		driver.findElement(By.id("name")).sendKeys("Alert");
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		//alert.accept();
		alert.dismiss();
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}
}
