package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Ex2 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		boolean logo = driver.findElement(By.id("email")).isDisplayed();
		if (logo == true) {
			System.out.println("Logo is available");
		} else {
			System.out.println("Logo is not available");
		}
		Thread.sleep(2000);
		driver.quit();
	}
}
