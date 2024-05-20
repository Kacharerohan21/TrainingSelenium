package Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Use_get_value {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("vengat16");
		driver.findElement(By.id("password")).sendKeys("Karthick");
		String s = driver.findElement(By.id("username")).getAttribute("value");
		String s1 = driver.findElement(By.id("password")).getAttribute("value");
		driver.findElement(By.id("login")).click();
		System.out.println(s);
		System.out.println(s1);
		Thread.sleep(2000);
		driver.quit();
	}

}
