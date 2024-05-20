package Basic;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge_demo {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		//Dimension d=new Dimension(400,500);
		//driver.manage().window().setSize(400);
		Alert alert=driver.switchTo().alert();
		alert.dismiss();
	}

}
