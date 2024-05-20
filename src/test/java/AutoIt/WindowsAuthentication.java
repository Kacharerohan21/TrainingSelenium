package AutoIt;


import static org.junit.Assert.*;

import java.io.IOException;
import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsAuthentication {

	WebDriver driver;
	String baseurl;
	
	@Before
	public void setUp() throws Exception {
	baseurl="https://www.guru99.com/use-autoit-selenium.html";
	driver=new ChromeDriver();
	driver.get(baseurl);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}

	@After
	public void tearDown() throws Exception {
	Thread.sleep(2000);
	//driver.quit();
	}

	@Test
	public void test() throws IOException {
	Runtime.getRuntime().exec("D:\\eclipse-workspace\\TrainingSelenium\\src\\test\\java\\AutoIt\\WindowAutoIt.exe");
	}

}
