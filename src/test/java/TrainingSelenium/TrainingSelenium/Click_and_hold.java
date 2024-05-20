package TrainingSelenium.TrainingSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Click_and_hold {
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	public void test() {

		WebElement S_E = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(0);

		WebElement drag_oppostion = driver.findElement(By.xpath("//div[contains(@id,'draggable')]"));
		WebElement drop_action = driver.findElement(By.xpath("//div[contains(@id,'droppable')]"));

		Actions action = new Actions(driver);
		action.clickAndHold(drag_oppostion).moveToElement(drop_action).release().build().perform();

	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}
