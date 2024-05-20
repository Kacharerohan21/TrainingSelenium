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

public class drag_and_drop_demo {

	WebDriver driver=new ChromeDriver();
	
	@Before
	public void setUp() throws Exception {
	driver.get("https://demo.automationtesting.in/Static.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

	@Test
	public void test()throws Exception {
		//WebElement S_E=driver.findElement(By.id("node"));
		//driver.switchTo().frame(S_E);

		Actions action=new Actions(driver);
		action.dragAndDrop(driver.findElement(By.id("node")), driver.findElement(By.id("droparea")));
		
		Thread.sleep(2000);
	}

}
