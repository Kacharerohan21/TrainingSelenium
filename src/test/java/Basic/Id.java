package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Id {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.xpath("//*[@id=\"login_link\"]/a[1]")).click();
		driver.findElement(By.id("identify_email")).sendKeys("21a@gmail.com");
		driver.findElement(By.id("did_submit")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.close();
		}

}
