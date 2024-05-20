package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class backtofacebook {

	public static void main(String[] args) throws Exception {
		ChromeOptions option=new ChromeOptions();
/* This line creates an instance of ChromeOptions, which is a class in Selenium used to configure various Chrome browser options.*/
		//option.addArguments("--disable-notifications");
/*This line adds a command-line argument to disable notifications in the Chrome browser. The --disable-notifications argument is used to prevent the browser from displaying notifications during the execution of your Selenium script.*/
		WebDriver driver =new ChromeDriver();
/* This line initializes the WebDriver with the ChromeDriver instance and passes the ChromeOptions instance (option) to it. This way, the Chrome browser will be launched with the specified options, including the disabled notifications.*/
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("facebook");
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).click();
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.quit();
	}

}
