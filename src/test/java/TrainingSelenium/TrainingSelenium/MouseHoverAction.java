package TrainingSelenium.TrainingSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MouseHoverAction {

	WebDriver driver = new ChromeDriver();
	JavascriptExecutor js;

	@Before
	public void setUp() throws Exception {

		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@Test
	public void test() throws Exception {
		js.executeScript("window.ScrollBy(0,600)");
		Thread.sleep(2000);

		WebElement mousebutton = driver.findElement(By.id("mousehover"));
		Actions action = new Actions(driver);
		action.moveToElement(mousebutton).perform();

		Thread.sleep(2000);
		WebElement SubElement = driver.findElement(By.xpath("//a[contains(text(),'Top')]"));
		action.moveToElement(SubElement).perform();
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
	//	driver.quit();
	}

}
