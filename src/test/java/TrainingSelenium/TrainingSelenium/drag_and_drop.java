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

public class drag_and_drop {

	WebDriver driver = new ChromeDriver();

	@Before
	public void setUp() throws Exception {
		driver.get("https://demoqa.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		WebElement d_c = driver.findElement(By.className("droppable-container"));
		driver.switchTo().frame(d_c);

		WebElement f_draggable = driver.findElement(By.id("draggable"));
		WebElement D_droppable = driver.findElement(By.id("droppable"));

		Actions action = new Actions(driver);
		action.dragAndDrop(f_draggable, D_droppable).perform();

	}

}
