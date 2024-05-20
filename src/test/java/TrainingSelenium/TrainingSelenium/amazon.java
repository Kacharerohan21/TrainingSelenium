package TrainingSelenium.TrainingSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class amazon {


	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("amazon");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"tads\"]/div/div/div/div/div[1]/a/div[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]")).click();
		driver.navigate().back();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"p_36/1318506031\"]/span/a/span")).click();
		driver.navigate().back();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(4000);
		driver.close();
		
	}

}
