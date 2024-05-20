package TrainingSelenium.TrainingSelenium;

import static org.junit.Assert.*;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Second_testcase {
	
	WebDriver driver=new ChromeDriver();
	
	@Before
	public void setUp() throws Exception {
		//driver=new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}

	@Test
	public void test() {
		String title=driver.getTitle();
		System.out.println("The title is : " +title);
		
		String CurrentURL=driver.getCurrentUrl();
		System.out.println("The current url is : " +CurrentURL);
		
		
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

}
