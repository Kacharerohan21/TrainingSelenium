package Basic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
public class ProfileDemo {

	public static void main(String[] args) {
		// After enter install the Firefox the code executable 
		// The 
		WebDriver driver;
		String baseURL="https://www.letskodeit.com/practice";
		ProfilesIni Profile=new ProfilesIni();
		FirefoxProfile fxProfile=Profile.getProfile("");
		
		FirefoxOptions options=new FirefoxOptions();
		options.setProfile(fxProfile);
		
		driver=new FirefoxDriver(options);
		driver.manage().window().maximize();
		driver.get(baseURL);
	}

}
