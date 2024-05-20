package TrainingSelenium.TrainingSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Multiple_select_list {

	WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
	driver=new ChromeDriver();
	driver.get("https://www.letskodeit.com/practice");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@Test
	public void test() throws Exception{
		WebElement element=driver.findElement(By.id("multiple-select-example"));
		Select sel=new Select(element);
		
		System.out.println("Select the Orange");
		sel.selectByVisibleText("Orange");
		
		Thread.sleep(2000);
		System.out.println("Select the value: apple");
		sel.selectByValue("apple");
		
		Thread.sleep(2000);
		System.out.println("Select the value : peach");
		sel.selectByValue("peach");
		
		Thread.sleep(2000);
		System.out.println("Select the all options");
		List<WebElement> selectoption=sel.getAllSelectedOptions();
		for(WebElement option:selectoption)
		{
			System.out.println(option.getText());
			
		}
		
		Thread.sleep(2000);
		System.out.println("\nThe value deselected");
		sel.deselectAll();
	}

	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}


}
