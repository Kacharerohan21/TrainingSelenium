package Basic;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead_demo {

	public static void main(String[] args) {

		XSSFWorkbook ExcelWBook;
		XSSFSheet ExcelWSheet;
		XSSFCell Cell;

		String path = "E:\\Rohan Kachare setup\\Selenium\\Excel\\ExcelRead.xlsx";
		String Sheetname="Sheet1";

		try {
			FileInputStream ExcelFile = new FileInputStream(path);
			ExcelWBook = new XSSFWorkbook(ExcelFile);
			ExcelWSheet = ExcelWBook.getSheet(Sheetname);
			Cell = ExcelWSheet.getRow(1).getCell(1);
			String CellData = Cell.getStringCellValue();
			System.out.println("The Value of cell : " + CellData);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
