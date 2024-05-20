package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JSE_Scroll_fuction {

	WebDriver driver = new ChromeDriver();
	JavascriptExecutor js;

	@Before
	public void setUp() throws Exception {
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		js = (JavascriptExecutor) driver;
	}

	@Test
	public void test() throws Exception {
		js.executeScript("window.location='https://www.letskodeit.com/practice' ");
		Thread.sleep(2000);

		js.executeScript("window.scrollBy(0,1900);");
		Thread.sleep(2000);

		js.executeScript("window.scrollBy(0, -1900);");
		Thread.sleep(2000);

		WebElement element = driver.findElement(By.id("mousehover"));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(2000);

		js.executeScript("window.scrollBy(0,0);");
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}
