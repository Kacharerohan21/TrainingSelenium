package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GoogleTitle_if_else {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals("Google"))
		{
			System.out.println("Correct title :" +title);
		}
		else
		{
			System.out.println("Incorrect title");
		}
		driver.close();
		
	}

}
