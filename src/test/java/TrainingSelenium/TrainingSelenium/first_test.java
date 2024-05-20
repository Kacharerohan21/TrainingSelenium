package TrainingSelenium.TrainingSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class first_test {

	WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
	driver=new ChromeDriver();	
	driver.get("https://www.letskodeit.com/practice");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	}

	@Test
	public void test() {
	driver.findElement(By.xpath("//*[@id=\"navbar-inverse-collapse\"]/div/div/a")).click();
	System.out.println("Click on the Sign button");
	driver.findElement(By.name("email")).sendKeys("email@gmail.com");
	driver.findElement(By.xpath("//input[contains(@id,'login-password')]")).clear();
	driver.findElement(By.xpath("//input[contains(@id,'login-password')]")).sendKeys("ABC");	
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}



}
