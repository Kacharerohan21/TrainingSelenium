package TrainingSelenium.TrainingSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Basic.GenericMethod;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GenericMethddemo {

	WebDriver driver = new ChromeDriver();

	private GenericMethod gm;

	@Before
	public void setUp() {
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	public void test() {
		WebElement element = gm.getElement("name", "id");
		element.sendKeys("test");
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}
