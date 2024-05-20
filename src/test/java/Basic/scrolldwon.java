package Basic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class scrolldwon {

	public static void main(String[] args) throws Exception {

		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.simplilearn.com/tutorials/selenium-tutorial/selenium-interview-questions-and-answers");
		driver.manage().window().maximize();
		((JavascriptExecutor)driver).executeScript("scroll(0,4000)");
		Thread.sleep(3000);
		driver.quit();
	}

}
