package POM_execute;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import POM.GoogleSearchPage;

public class POM_GoogleSearchPages {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		GoogleSearchPage.Text_box(driver).sendKeys("Automation testing start");
		GoogleSearchPage.Text_box(driver).sendKeys(Keys.ENTER);
	}
}
