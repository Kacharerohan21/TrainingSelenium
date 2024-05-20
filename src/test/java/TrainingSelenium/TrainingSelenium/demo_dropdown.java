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

public class demo_dropdown {
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@Test
	public void test() throws InterruptedException {
		WebElement element = driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select"));
		Select sel = new Select(element);

		System.out.println("Select the India");
		sel.selectByVisibleText("India");

		Thread.sleep(2000);
		System.out.println("Select value:3");
		sel.selectByIndex(3);

		Thread.sleep(2000);
		System.out.println("Select the text : Benin");
		sel.selectByVisibleText("Benin");

		Thread.sleep(2000);
		System.out.println("Select the counrty");
		sel.selectByValue("IND");

	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}
