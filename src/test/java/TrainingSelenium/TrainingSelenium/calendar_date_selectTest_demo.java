package TrainingSelenium.TrainingSelenium;

import static org.junit.Assert.*;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class calendar_date_selectTest_demo {
	// please refer the udemy video 100
	
WebDriver driver;

	@Before
	public void setUp() throws Exception {
		driver =new ChromeDriver();
		driver.get("");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

	@Test
	public void test() {
		List<WebElement> element=driver.findElements(null);
	}

}
