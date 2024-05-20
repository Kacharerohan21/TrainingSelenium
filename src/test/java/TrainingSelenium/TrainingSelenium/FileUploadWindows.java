package TrainingSelenium.TrainingSelenium;

import static org.junit.Assert.*;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FileUploadWindows {

	WebDriver driver=new ChromeDriver();
	
	@Before
	public void setUp() throws Exception {
		driver.get("https://mail.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}

	@Test
	public void test() {
		driver.findElement(By.id("identifierId")).sendKeys("kacharerohan21@gmail.com");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		
		
		
	}
	
	@After
	public void tearDown() throws Exception {
	Thread.sleep(2000);
	}

}
