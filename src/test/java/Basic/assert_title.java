package Basic;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

class assert_title {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.co.in/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
String title=driver.getTitle();
System.out.println("The acutal title is : " +title);
if(title.equals("Google"))
{
System.out.println("The page title is : " +title);
}
else
{
System.out.println("Please check the link");	
}
Thread.sleep(2000);
driver.quit();
	}

}
