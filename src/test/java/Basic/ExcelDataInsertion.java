package Basic;

import java.io.FileInputStream;
import java.time.Duration;
import java.io.File;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelDataInsertion {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		try {
			FileInputStream ExcelFile = new FileInputStream(
					new File("E:\\Rohan Kachare setup\\Selenium\\Excel\\ExcelFile.xlsx"));
			Workbook workbook = WorkbookFactory.create(ExcelFile);
			Sheet sheet = workbook.getSheetAt(0);
			for (Row row : sheet) {
				String data1 = row.getCell(0).getStringCellValue();
				String data2 = row.getCell(1).getStringCellValue();

				WebElement inputfield1 = driver.findElement(By.id("email"));
				inputfield1.sendKeys(data1);

				WebElement inputfield2 = driver.findElement(By.id("login-password"));
				inputfield2.sendKeys(data2);

				driver.findElement(By.id("login")).click();

				inputfield1.clear();
				inputfield2.clear();
				Thread.sleep(2000);
			}
			workbook.close();
			ExcelFile.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		driver.quit();
	}
}
