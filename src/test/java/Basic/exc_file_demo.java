package Basic;
import java.io.File;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class exc_file_demo {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();

		options.addExtensions(new File("/path/to/extension.crx"));

		ChromeDriver driver = new ChromeDriver(options);
	}

}
