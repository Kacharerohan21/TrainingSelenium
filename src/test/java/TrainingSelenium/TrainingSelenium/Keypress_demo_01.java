package TrainingSelenium.TrainingSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Keypress_demo_01 {

	WebDriver driver = new ChromeDriver();

	@Before
	public void setUp() throws Exception {
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}

	@Test
	public void test() {
		//driver.findElement(By.id("page")).sendKeys(Keys.COMMAND + "a");
		driver.findElement(By.id("page")).sendKeys(Keys.chord(Keys.COMMAND, "a"));
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		// driver.quit();
	}

}
