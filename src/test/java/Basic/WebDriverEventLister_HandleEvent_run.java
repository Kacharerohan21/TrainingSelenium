package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class WebDriverEventLister_HandleEvent_run {
	
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.expedia.com/");
		EventFiringWebDriver eDriver=new EventFiringWebDriver(driver);
		WebDriverEventLister_HandleEvent WDEL= new WebDriverEventLister_HandleEvent();
		eDriver.register(WDEL);
		
	}

}
