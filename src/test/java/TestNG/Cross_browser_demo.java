package TestNG;

import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterTest;

public class Cross_browser_demo {

	WebDriver driver;
	ChromeOptions chromeoptions = new ChromeOptions();
	FirefoxOptions firefoxoptions = new FirefoxOptions();
	EdgeOptions edgeoptions = new EdgeOptions();

	@Parameters("browser")

	@BeforeTest
	public void initialize(String browser) throws Exception {
		if (browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			System.out.println("Chrome is launched");
		} else if (browser.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			System.out.println("Edge is launched");
		}
	}

	@Test
	public void f() {
		driver.get("https://www.citi.com/");
		String title = driver.getTitle();
		System.out.println(title);
	}

	@AfterTest
	public void afterTest() throws Exception {
		Thread.sleep(2000);
		driver.quit();

	}
}