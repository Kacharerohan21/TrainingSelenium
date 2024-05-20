package TrainingSelenium.TrainingSelenium;

import static org.junit.Assert.*;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GetTextbutton_demo {

	WebDriver driver=new ChromeDriver();
	@Before
	public void setUp() throws Exception {
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	@Test
	public void test() {
		WebElement buttontext=driver.findElement(By.id("openwindow"));
		String element=buttontext.getText();
		System.out.println("The name of the button is :" +element);
	}
		
	@After
	public void tearDown() throws Exception {
	Thread.sleep(2000);
	driver.quit();
	}



}
