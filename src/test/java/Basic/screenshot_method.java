package Basic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class screenshot_method {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("amazon");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File("E:\\Rohan Kachare setup\\Selenium\\Screenshot\\Screenshot_method\\Screen.png"));
		driver.close();
		
	}

}
