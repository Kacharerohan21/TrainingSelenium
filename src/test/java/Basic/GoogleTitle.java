package Basic;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class GoogleTitle {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		String title= driver.getTitle();
		System.out.print(title);
		// This is positive test case. 
		Assert.assertEquals(title,"Google","Google");
		
		driver.close();
	}

}
