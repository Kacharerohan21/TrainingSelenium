package TrainingSelenium.TrainingSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_login {
	@Test
	public void Login_test() throws InterruptedException
	{
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.className("Username")).sendKeys("Admin");
		driver.findElement(By.className("Password")).sendKeys("admin123");
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		Thread.sleep(3000);
		driver.close();
		
	}

}
