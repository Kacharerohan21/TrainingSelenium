package TrainingSelenium.TrainingSelenium;

import static org.junit.Assert.*;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Demo_test_case_4 {
	WebDriver driver=new ChromeDriver();

	@Before
	public void setUp() throws Exception {
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	public void test() {
	WebElement e1=driver.findElement(By.id("APjFqb"));
	System.out.println("E1 is Enble?" +e1.isEnabled());
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}
