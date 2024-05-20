package TrainingSelenium.TrainingSelenium;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class third_test_case {

	WebDriver driver=new ChromeDriver();
	
	
	@Before
	public void setUp() throws Exception {
	driver.get("https://www.letskodeit.com/practice");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	}

	@Test
	public void test() throws Exception{
		String title=driver.getTitle();
		System.out.println("The title of the Page :\n" +title);
		
		Thread.sleep(2000);
		String CurrentURL=driver.getCurrentUrl();
		System.out.println("\nThe Currert URL of the Page :\n" +CurrentURL);
		
		Thread.sleep(2000);
		driver.navigate().to("https://www.youtube.com/");
		CurrentURL=driver.getCurrentUrl();
		System.out.println("\nThe Current URL :\n" +CurrentURL);
		
		Thread.sleep(2000);
		title=driver.getTitle();
		System.out.println("\nThe Title of the Page : \n"+title);
		
		
		Thread.sleep(2000);
		driver.navigate().back();
		CurrentURL=driver.getCurrentUrl();
		System.out.println("\nThe Current URL :\n" +CurrentURL);

		Thread.sleep(2000);
		driver.navigate().forward();
		CurrentURL=driver.getCurrentUrl();
		System.out.println("\nThe Current URL :\n" +CurrentURL);
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		CurrentURL=driver.getCurrentUrl();
		System.out.println("\nThe Current URL : \n" +CurrentURL);
		
		Thread.sleep(2000);
		driver.navigate().back();
		CurrentURL=driver.getCurrentUrl();
		System.out.println("\nThe Current URL :\n" +CurrentURL);


		Thread.sleep(2000);
		String pageSoruce=driver.getPageSource();
		System.out.println("\nThe Current Source : \n" +pageSoruce);
	}

	
	@After
	public void tearDown() throws Exception {
	driver.quit();
	}

	

}
