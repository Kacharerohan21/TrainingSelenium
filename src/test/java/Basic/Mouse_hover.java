package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_hover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.letskodeit.com/practice");
		Actions action=new Actions(driver);
		//WebElement BElement=driver.findElement(By.name("btnK"));
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"hondaradio\"]"))).perform();
	}

}
