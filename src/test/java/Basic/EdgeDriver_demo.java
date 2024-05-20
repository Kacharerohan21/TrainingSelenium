package Basic;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDriver_demo {

	public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.co.in/");
        driver.findElement(By.name("q")).sendKeys("the-internet.herokuapp.com/basic_auth");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.manage().window().maximize();
        
        
	}

}
