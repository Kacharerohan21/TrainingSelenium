package TrainingSelenium.TrainingSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class slider_demo {

	WebDriver driver = new ChromeDriver();

	@Before
	public void setUp() throws Exception {
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
	}

	@Test
	public void test() throws Exception {
		driver.switchTo().frame(0);
		Thread.sleep(2000);

		WebElement element = driver.findElement(By.xpath("//body/div[@id='slider']/span[1]"));
		Actions action = new Actions(driver);
		action.dragAndDropBy(element, 100, 0).perform();
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}
}
