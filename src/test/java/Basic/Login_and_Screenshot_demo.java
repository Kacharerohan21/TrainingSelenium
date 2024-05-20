package Basic;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;

public class Login_and_Screenshot_demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("vengatram");
		driver.findElement(By.id("password")).sendKeys("vengat@123445");
		driver.findElement(By.id("login")).click();
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f,new File("E:\\Rohan Kachare setup\\Selenium\\Screenshot\\Screenshot_method//ss.jpg"));
		System.out.println("The ScreenShot access capture");
		driver.quit();
	}

}
