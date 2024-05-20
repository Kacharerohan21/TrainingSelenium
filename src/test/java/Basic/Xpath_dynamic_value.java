package Basic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_dynamic_value {

	public static void main(String[] args)throws Exception {
		WebDriver driver=new ChromeDriver();
		/*
		 * Syntax: for class
		 *  input[class='class-value'] 
		 *   	or
		 *  .class-value
		 *   	or
		 *   input.class-value 
		 */
		driver.get("https://www.facebook.com/login/");
		//  input[class='class-value'] 
		driver.findElement(By.cssSelector("input[class='inputtext _55r1 inputtext _1kbt inputtext _1kbt']")).sendKeys("First_name");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[class='inputtext _55r1 inputtext _1kbt inputtext _1kbt']")).clear();
		
	}

}
