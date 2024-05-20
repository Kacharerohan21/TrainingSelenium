package TrainingSelenium.TrainingSelenium;

import static org.junit.Assert.*;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class calendar_date_select {
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		driver.get("https://www.expedia.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	public void test() {
		// driver.findElement(By.xpath("//*[@id=\"lodging_search_form\"]/div/div/div[1]/div/div/div[2]/div[1]/button")).sendKeys("America");
		/*
		 * WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		 * WebElement select=wait.until(ExpectedConditions.visibilityOfElementLocated
		 * (By.xpath(
		 * "//body[1]/div[1]/div[1]/div[2]/section[1]/div[3]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[5]/td[5]/div[1]"
		 * ))); ////button[@name='EGDSDateRange-date-selector-trigger'] select.click();
		 */

		// //section[@tabindex='-1']//table//tbody//tr[3]

		driver.findElement(By.xpath("//*[@id=\"lodging_search_form\"]/div/div/div[2]/div/div[1]/div/div/button"))
				.click();
		driver.findElement(By.xpath("//span[contains(text(),'± 1 day')]")).click();

		driver.findElement(By.xpath(
				" //section[@tabindex='-1']//table//tbody//tr[5]//div[@tabindex='-1']//div[@aria-label='Sunday, February 25, 2024']"))
				.click();
		driver.findElement(By.xpath("//button[contains(@id,'search_button')]")).click();
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}
