package TrainingSelenium.TrainingSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Attributetype {

	WebDriver driver = new ChromeDriver();

	@Before
	public void setUp() throws Exception {
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

	@Test
	public void test() {

		WebElement element = driver.findElement(By.id("opentab"));
		String attributetype = element.getAttribute("class");

		System.out.println("The attributetype is : " + attributetype);
	}

}
