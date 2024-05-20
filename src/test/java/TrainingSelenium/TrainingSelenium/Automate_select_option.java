package TrainingSelenium.TrainingSelenium;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Automate_select_option {

	WebDriver driver=new ChromeDriver();
	
	//102 and 103
	
	@Before
	public void setUp() throws Exception {
	driver.get("https://www.goibibo.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	public void test() {
		try {
            Alert alert = driver.switchTo().alert();
            // If an alert is present, close it
            alert.dismiss(); // or alert.accept() depending on the desired action
        } catch (Exception e) {
            // No alert present, continue with other actions
            e.printStackTrace();
        }		
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		//driver.quit();
	}

	

}
