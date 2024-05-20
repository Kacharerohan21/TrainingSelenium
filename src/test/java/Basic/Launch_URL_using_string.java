package Basic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_URL_using_string {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		String BaseURL="https://www.youtube.com/";
		driver.get(BaseURL);
	}

}
