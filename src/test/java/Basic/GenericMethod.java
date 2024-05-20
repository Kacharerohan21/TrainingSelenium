package Basic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class GenericMethod {
	WebDriver driver;
	
	public GenericMethod(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement getElement(String locator,String type)
	{
		type=type.toLowerCase();
		if(type.equals("id"))
		{
			System.out.println("Element found by Id : " +locator);
			return this.driver.findElement(By.id(locator));
		}
		else if(type.equals("xpath"))
		{
			System.out.println("Element found by Xpath : " +locator);
			return this.driver.findElement(By.xpath(locator));
		}
		
		else {
			System.out.println("Locator types not supported ");
			return null;
		}		
	}

}
