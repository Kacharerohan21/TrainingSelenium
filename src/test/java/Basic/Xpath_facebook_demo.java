package Basic;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_facebook_demo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.google.com/");
		/*
		 *  //input_name[contains(@attribute_name,'name')] 
		 */
		driver.findElement(By.xpath("//textarea[contains(@name,'q')]")).sendKeys("Facebook");
		driver.findElement(By.xpath("//textarea[contains(@name,'q')]")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//a[contains(text(),'Log In')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
	/*
	 * Observed the, if your automate the facebook site then 'Create new account' option in not open
	 */
		driver.quit();
		
	}

}
