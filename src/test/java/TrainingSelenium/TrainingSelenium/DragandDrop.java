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

public class DragandDrop {

	WebDriver driver = new ChromeDriver();

	@Before
	public void setUp() throws Exception {
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

	@Test
	public void test()throws Exception {
		
		WebElement S_E = driver.findElement(By.xpath("//iframe[contains(@class,'demo-frame')]"));
		driver.switchTo().frame(S_E);

		Thread.sleep(2000);
		WebElement draggable_01=driver.findElement(By.id("draggable"));
		WebElement droppable_01=driver.findElement(By.id("droppable"));

		Actions action = new Actions(driver);
		action.dragAndDrop(draggable_01, droppable_01).build().perform();
		//action.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
	}

}
