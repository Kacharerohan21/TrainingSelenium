package TrainingSelenium.TrainingSelenium;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Keypress_demo_02 {

	WebDriver driver = new ChromeDriver();

	@Before
	public void setUp() throws Exception {
//https://www.letskodeit.com/practice
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
	}

	@Test
	public void test() {
		Actions action = new Actions(driver);
		action.keyDown(Keys.COMMAND).sendKeys("a").keyUp(Keys.COMMAND).perform();
	}

}
