package TrainingSelenium.TrainingSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class POM {

	public static WebElement element = null;

	public static WebElement originTextBox(WebDriver driver) {
		element = driver.findElement(By.name("s"));
		return element;
	}

	public static WebElement originclick(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[contains(@href,'https://jqueryui.com/support/')]"));
		return element;
	}

	public static WebElement DragandDrop(WebDriver driver)throws Exception {
		element = driver.findElement(By.xpath("//iframe[contains(@class,'demo-frame')]"));
		driver.switchTo().frame(element);
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable")));
		Thread.sleep(2000);
		return element;
	}

	public static WebElement originclickdemo_02(WebDriver driver)
	{
		element =driver.findElement(By.xpath("//a[contains(text(),'Droppable')]"));
		return element;
	}
}
