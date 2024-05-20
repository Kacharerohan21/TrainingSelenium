package Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitTypes {
	WebDriver driver;

	public WaitTypes(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement waitForElement(By locator, int timeout) {
		WebElement element = null;
		try {
			System.out.println("Waiting for the Max : " + timeout + "Second for the element  to be available ");
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			System.out.println("The element appeared on the Web pages");
		} catch (Exception e) {
			System.out.println("The element is not appeared on the Web page");
		}
		return element;
	}
}
