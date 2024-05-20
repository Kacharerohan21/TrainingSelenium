package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook_title_using_if_else {

	public static void main(String[] args)throws Exception {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Facebook.com");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//h3[contains(text(),'Facebook - log in or sign up')]")).click();
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals("Facebook – log in or sign up"))
		{
			System.out.println("The Correct title displayed...\n Correct Title : " +title);
		}
		else
		{
			System.out.println("The incorrect title displayed. The correct title displyed in the below line:\n Correct Title :" +title);
		}
		Thread.sleep(5000);
		driver.quit();
	}

}
