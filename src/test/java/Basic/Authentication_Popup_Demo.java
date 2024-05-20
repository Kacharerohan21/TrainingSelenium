package Basic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication_Popup_Demo {

	public static void main(String[] args)throws Exception{
		WebDriver driver=new ChromeDriver();
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		//http://username:password@test.com
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		String text=driver.findElement(By.xpath("//*[@id=\"content\"]/div/p")).getText();
		System.out.println(text);
	//hread.sleep(3000);)
		driver.close();
	}

}
