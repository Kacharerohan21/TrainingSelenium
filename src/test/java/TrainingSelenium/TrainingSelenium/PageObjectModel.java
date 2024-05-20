package TrainingSelenium.TrainingSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PageObjectModel {

	WebDriver driver = new ChromeDriver();
	private String baseURL;

	@Before
	public void setUp() throws Exception {
		baseURL = "https://jqueryui.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Test
	public void test() {
		driver.get(baseURL);
		POM.originTextBox(driver).sendKeys("Button");
		POM.originclick(driver).click();
		POM.originclickdemo_02(driver).click();
	}

	@Test
	public void test1() throws Exception {
		driver.get("https://jqueryui.com/droppable/");
		POM.DragandDrop(driver);
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}
