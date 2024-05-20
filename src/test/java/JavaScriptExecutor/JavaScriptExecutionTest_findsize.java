package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JavaScriptExecutionTest_findsize {

	WebDriver driver;
	JavascriptExecutor js;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	public void test() {
		js.executeScript("window.location='https://www.letskodeit.com/practice' ");
		long height = (Long) js.executeScript("return windon.innerHeight");
		long width = (Long) js.executeScript("return window.innerWidth");

		System.out.println("Height is : " + height);
		System.out.println("Width is : " + width);
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}



}
