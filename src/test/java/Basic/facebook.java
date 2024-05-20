package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class facebook {

	public static void main(String[] args) throws Exception {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("Kacharerohan21@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Rohan@11999");
		driver.findElement(By.name("login")).click();
		Thread.sleep(8000);
		driver.close();
	}

}
