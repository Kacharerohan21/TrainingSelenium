package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class facebooklaunch {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Kacharerohan21@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Rohan@11999");
		driver.findElement(By.name("login")).click();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();
	}

}
