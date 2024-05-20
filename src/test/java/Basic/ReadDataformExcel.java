package Basic;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataformExcel {

	public static void main(String[] args) {

		XSSFWorkbook ExcelWBook;
		XSSFSheet ExcelWSheet;
		XSSFCell Cell;

		String path = "E://Rohan Kachare setup//Selenium//Excel//ReadData.xlsx";
		String sheetName = "Sheet1";

		try {
			FileInputStream Excelfile = new FileInputStream(path);
			ExcelWBook = new XSSFWorkbook(Excelfile);

			ExcelWSheet = ExcelWBook.getSheet(sheetName);

			Cell = ExcelWSheet.getRow(1).getCell(1);
			String celldata = Cell.getStringCellValue();
			System.out.println("Cell Data :" + celldata);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
