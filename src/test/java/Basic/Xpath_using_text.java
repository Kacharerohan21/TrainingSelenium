package Basic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_using_text {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		/*
		 * Syntax://tagname[contains(text(),'value']
		 */
		driver.findElement(By.xpath("//a[contains(text(),'Create a Page')]")).click();
	}

}
