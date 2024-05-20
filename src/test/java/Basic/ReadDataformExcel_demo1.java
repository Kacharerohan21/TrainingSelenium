package Basic;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataformExcel_demo1 {

    public static void main(String[] args) {

        XSSFWorkbook ExcelWBook;
        XSSFSheet ExcelWSheet;
        XSSFCell Cell;

        String path = "E:\\Rohan Kachare setup\\Selenium\\Excel\\ReadData.xlsx";
        String sheetName = "Sheet1";

        try {
            FileInputStream Excelfile = new FileInputStream(path);
            ExcelWBook = new XSSFWorkbook(Excelfile);

            ExcelWSheet = ExcelWBook.getSheet(sheetName);

            // Check if the row and cell are not null
            if (ExcelWSheet.getRow(1) != null) {
                Cell = ExcelWSheet.getRow(1).getCell(1);

                // Check if the cell is not null
                if (Cell != null) {
                    String celldata = Cell.getStringCellValue();
                    System.out.println("Cell Data :" + celldata);
                } else {
                    System.out.println("Cell is null");
                }
            } else {
                System.out.println("Row is null");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
