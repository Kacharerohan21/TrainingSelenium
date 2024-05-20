package TrainingSelenium.TrainingSelenium;

import static org.junit.Assert.*;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;



public class AccessPassword_facebook {

	WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}

	@After
	public void tearDown() throws Exception {
	Thread.sleep(2000);
	driver.quit();
	}

	@Test
	public void test() {
		WebElement Email=driver.findElement(By.id("email"));
		Email.sendKeys("Kacharerohan21@gmail.com");
		
		//EnterPassword passwordEntry=new EnterPassword();
		String A_Password= EnterPassword.getPassword();
		
		WebElement PasswordInput=driver.findElement(By.id("pass"));
		PasswordInput.sendKeys(A_Password);
		
		WebElement 	Log_in=driver.findElement(By.xpath("//button[@id='u_0_9_sM']"));
		Log_in.click();
	}

}
