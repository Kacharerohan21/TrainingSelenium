package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Driver_Quit {
	
	public static void main(String[] args)throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		driver.quit();
		Thread.sleep(2000);
		driver.get("https://www.google.co.in/");
	}

}
