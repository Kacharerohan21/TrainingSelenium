package JavaScriptExecutor;


import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JavaScriptExecution {

	WebDriver driver;
	JavascriptExecutor js;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		//driver.get("https://www.letskodeit.com/practice");
		js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

	@Test
	public void test() {
		js.executeScript("window.location= 'https://www.letskodeit.com/practice' ");
		WebElement textBox = (WebElement) js.executeScript("return document.getElementById('name');");
		textBox.sendKeys("test");
	}
}
