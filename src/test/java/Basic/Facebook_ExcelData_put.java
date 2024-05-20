
package Basic;

import java.io.FileInputStream;
import java.io.File;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_ExcelData_put {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		try {
			FileInputStream ExcelFile = new FileInputStream(
					new File("E:\\Rohan Kachare setup\\Selenium\\Excel\\facebookExcel_data1.xlsx"));
			Workbook workbook = WorkbookFactory.create(ExcelFile);
			Sheet sheet = workbook.getSheetAt(0);

			for (Row row : sheet) {
				String data1 = row.getCell(0).getStringCellValue();
				String data2 = row.getCell(1).getStringCellValue();

				WebElement input1 = driver.findElement(By.id("email"));
				input1.sendKeys(data1);

				WebElement input2 = driver.findElement(By.id("pass"));
				input2.sendKeys(data2);

				driver.findElement(By.id("loginbutton")).click();

				Alert alert= driver.switchTo().alert();
				alert.dismiss();
				
				input1.clear();
				input2.clear();
				Thread.sleep(2000);

			}
			workbook.close();
			ExcelFile.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// driver.close();
	}

}
