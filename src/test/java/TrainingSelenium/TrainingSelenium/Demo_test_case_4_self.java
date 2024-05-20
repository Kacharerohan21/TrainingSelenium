package TrainingSelenium.TrainingSelenium;

import static org.junit.Assert.*;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Demo_test_case_4_self {

	WebDriver driver;	
	
	@Before
	public void setUp() throws Exception {
		//driver=new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}

	@Test
	public void test1()throws Exception {
		driver=new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		String title=driver.getTitle();
		System.out.println("The title of the Page :\n" +title);	
		
		Thread.sleep(2000);
		String CurrentURL=driver.getCurrentUrl();
		CurrentURL=driver.getCurrentUrl();
		System.out.println("\nThe current url of the Page : \n" +CurrentURL);
		
		
	}
	
	@Test
	public void test2() throws Exception{
		driver= new ChromeDriver();
		driver.get("https://www.youtube.com/");
		String CurrentURL=driver.getCurrentUrl();
		System.out.println("The current url page : \n" +CurrentURL);
		
		Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println("The title of page : \n" +title);
	
	}

	@Test
	public void test3()throws Exception {
		driver=new EdgeDriver();
		driver.get("https://www.google.co.in/");
		String CurrentURL=driver.getCurrentUrl();
		System.out.println("The current url page : \n" +CurrentURL);
		
		Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println("The title of page : \n" +title);
	
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	
}
