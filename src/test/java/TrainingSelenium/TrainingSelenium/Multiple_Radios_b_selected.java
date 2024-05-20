package TrainingSelenium.TrainingSelenium;

import static org.junit.Assert.*;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Multiple_Radios_b_selected {

	WebDriver driver=new ChromeDriver();
	
	@Before
	public void setUp() throws Exception {
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	public void test() throws Exception{
		boolean isChecked=false;
		List<WebElement> radioButtons=driver.findElements(By.xpath("//input[contains(@type,'radio') and contains(@name,'cars')]"));
		int size=radioButtons.size();
		System.out.println("Size of the list : "+size);
		for(int i=0;i<=size;i++)
		{
			isChecked = radioButtons.get(i).isSelected();
			
			if(!isChecked)
			{
				radioButtons.get(i).click();
				Thread.sleep(3000);
			}
		}
	}

	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}
	


}
