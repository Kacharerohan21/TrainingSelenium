package TrainingSelenium.TrainingSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ExplicitWait {
	
WebDriver driver;
public String baseurl;	
	@Before
	public void setUp() throws Exception {
		driver=new ChromeDriver();
		baseurl = "https://www.letskodeit.com/login";
		driver.manage().window().maximize();
		
	}

	@Test
	public void test() {
		driver.get(baseurl);
		driver.findElement(By.className("dynamic-link")).click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3));
		WebElement Element= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		Element.sendKeys("text");
		
	}

	
	@After
	public void tearDown() throws Exception {
	Thread.sleep(2000);
	driver.quit();
	}

	
}
