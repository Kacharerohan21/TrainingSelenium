package TrainingSelenium.TrainingSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.google.common.base.Verify;

import static org.junit.Assert.*;
import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class assert_title_google {

	WebDriver driver=new ChromeDriver();
	@Before
	public void setUp() throws Exception {
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	public void test() {
		String title=driver.getTitle();
		Assert.assertEquals("Gooogle", title);
		//System.out.println("The title of the Page :" +title);
	}
	@Test
	public void test2()
	{
		String title =driver.getTitle();
		Assert.assertEquals("Google", title);
	}
	
	@Test
	public void test3 ()
	{
		String title =driver.getTitle();
		Verify.verifyNotNull("Google", title, "Google");
	}

	@After
	public void tearDown() throws Exception {
	Thread.sleep(2000);
	driver.quit();
	}

	
}
