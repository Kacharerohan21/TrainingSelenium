package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JavaScriptExecutor_checkbox {

	WebDriver driver = new ChromeDriver();
	JavascriptExecutor js;

	@Before
	public void setUp() throws Exception {
		js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

	@Test
	public void test() throws Exception {
		js.executeScript("window.location='https://www.letskodeit.com/practice' ");
		Thread.sleep(2000);
		WebElement Checkbox = driver.findElement(By.id("bmwcheck"));
		js.executeScript("arguments[0].click();", Checkbox);
	}

}
