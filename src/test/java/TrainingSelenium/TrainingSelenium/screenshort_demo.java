package TrainingSelenium.TrainingSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class screenshort_demo {

	WebDriver driver=new ChromeDriver();
	@Before
	public void setUp() throws Exception {
	driver.get("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=100");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	public void test() throws IOException {
		driver.findElement(By.name("login")).click();
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f,new File("E:\\Rohan Kachare setup\\Selenium\\Screenshot\\Screenshot_method//ss1.jpg"));
	}
	
	@After
	public void tearDown() throws Exception {
	Thread.sleep(2000);
	driver.quit();
	}



}
