package Basic;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;  
import org.testng.annotations.Test;  
import org.testng.annotations.BeforeTest;  
import org.testng.annotations.Test;  
public class Get {

	public static void main(String[] args) {

		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Woocommerece");
		driver.findElement(By.name("q")).click();

	}

}
