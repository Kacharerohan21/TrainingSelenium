package TrainingSelenium.TrainingSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Dropdown {
	WebDriver driver;
	@Before
	public void setUp() throws Exception {
	driver=new ChromeDriver();
	driver.get("https://www.letskodeit.com/practice");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	public void test1() throws Exception {
		WebElement Element=driver.findElement(By.id("carselect"));
		Select sel=new Select(Element);
		
		System.out.println("Select the 2 value");
		sel.selectByIndex(2);
		Thread.sleep(3000);
		
		System.out.println("Select the value 'BMW'");
		sel.selectByValue("bmw");
		Thread.sleep(3000);
		
		System.out.println("select the value :Honda");
		sel.selectByVisibleText("Honda");
	}
	
	@Test
	public void test2() throws Exception {
		WebElement Element=driver.findElement(By.id("carselect"));
		Select sel=new Select(Element);
		
		//System.out.println("The test cases number 2");
		System.out.println("Select the 2 value");
		sel.selectByIndex(2);
		Thread.sleep(3000);
		
		System.out.println("Select the value 'BMW'");
		sel.selectByValue("bmw");
		Thread.sleep(3000);
		
		System.out.println("select the value :Honda");
		sel.selectByVisibleText("Honda");
	}

	@After
	public void tearDown() throws Exception {
	Thread.sleep(2000);
	driver.quit();
	}
	

	
}
