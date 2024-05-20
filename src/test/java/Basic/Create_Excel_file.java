package Basic;

import java.io.File;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Create_Excel_file {

	public static void main(String[] args) {
		 XSSFWorkbook wb = new XSSFWorkbook();
	        XSSFSheet sheet = wb.createSheet("Employee Details");

	        Object[][] employees = {
	            {"First Name", "Last Name", "Salary"},
	            {"Rohan", "Kachare", 100000},
	            {"Omkar", "Dhore", 2000},
	            {"Ajay", "Dhore", 30000 },
	            {"gavrao", "Rane", 30000},
	            {"Om", "Kantode", 4000},
	        };
	        int rowCount = 0;
	        for (Object[] emp: employees) {
	            Row row = sheet.createRow(rowCount++);
	            int columCount = 0;
	            for (Object colField: emp) {
	                Cell cell = row.createCell(columCount++);
	                if (colField instanceof String) {
	                    cell.setCellValue((String) colField);
	                } else if (colField instanceof Integer) {
	                    cell.setCellValue((Integer) colField);
	                }
	            }
	        }
	        try {
	            FileOutputStream output = new FileOutputStream(new File("C:\\Users\\Kacha\\eclipse-workspace\\TrainingSelenium\\src\\test\\java\\Basic\\outputVal.xlsx"));
	            wb.write(output);
	            output.close();
	            wb.close();
	            System.out.println("Excel created and data added successfully!");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}

}
