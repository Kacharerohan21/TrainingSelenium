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

public class List_dropdownTest_demo_name {

	WebDriver driver = new ChromeDriver();

	@Before
	public void setUp() throws Exception {
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	public void test() throws InterruptedException {
		WebElement element = driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select"));
		Select sel = new Select(element);

		System.out.println("Select the country");
		sel.selectByVisibleText("India");

		System.out.println("Select the value :3");
		sel.selectByIndex(3);

		System.out.println("Select the value:Benin");
		sel.selectByVisibleText("Benin");

		System.out.println("Select the value: ");
		sel.selectByValue("IND");
		
		
		System.out.println("\n\nThe list of the element in the Drop down: \n");

		List<WebElement> option = sel.getOptions();
		int size = option.size();

		for (int i = 0; i < size; i++) {
			String optionName = option.get(i).getText();
			System.out.println(optionName);
		}
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();

	}

}
