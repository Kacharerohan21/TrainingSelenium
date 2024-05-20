package TrainingSelenium.TrainingSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;

import java.time.Duration;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class radio_button_demo {
	WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.letskodeit.com/practice");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@Test
	public void test() throws InterruptedException {
		List<WebElement> radiobutton=driver.findElements(By.xpath("//input[contains(@type,'radio') and //input[contains(@name,'cars')]]"));
		int size=radiobutton.size();
		boolean isCheck=false;
		System.out.println("The elements in the radio button " +size);
		for(int i=0;i<=size;i++)
		{
			isCheck =radiobutton.get(i).isSelected();
			
			if(!isCheck)
			{
				radiobutton.get(i).click();
				Thread.sleep(2000);
			}
		}
		
	}

	@After
	public void tearDown() throws Exception {
	Thread.sleep(2000);
	driver.quit();
	}
	
}
