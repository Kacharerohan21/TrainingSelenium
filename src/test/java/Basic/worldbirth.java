package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class worldbirth {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.worldometers.info/world-population/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(""));
	}

}
