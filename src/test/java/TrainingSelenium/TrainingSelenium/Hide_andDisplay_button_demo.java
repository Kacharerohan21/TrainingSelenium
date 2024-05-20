package TrainingSelenium.TrainingSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Hide_andDisplay_button_demo {

	WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

	@Test
	public void test1()throws Exception {
	driver.get("https://www.letskodeit.com/practice");
	WebElement textbox=driver.findElement(By.id("displayed-text"));
	System.out.println("The text Box is Displayed :" +textbox.isDisplayed());
	
	Thread.sleep(2000);
	WebElement hidetextbox=driver.findElement(By.id("hide-textbox"));
	hidetextbox.click();
	System.out.println("The Text box is displyed :" +textbox.isDisplayed());
	
	Thread.sleep(2000);
	WebElement showtextbox=driver.findElement(By.id("show-textbox"));
	showtextbox.click();
	System.out.println("The Text box is Displated :" +textbox.isDisplayed());
	}

	
	@After
	public void tearDown() throws Exception {
	Thread.sleep(2000);
	driver.quit();
	}


}
