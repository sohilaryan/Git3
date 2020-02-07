package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelDemoTest {

	@Test
	public static void maindata() throws IOException {
		// poor Obfuscation Implementation
				FileInputStream fis = new FileInputStream("./src/test/resources/Book1.xlsx");

				Workbook wbook = new XSSFWorkbook(fis);
				Sheet sheet = wbook.getSheet("Sheet1");
				
				
				
				Row row = sheet.getRow(0);
				Cell cell = row.getCell(0);
				// System.out.println(cell.toString());
				int rows = sheet.getPhysicalNumberOfRows();
				int cols = sheet.getRow(0).getLastCellNum();

				Object[][] listData = new Object[rows][cols];
//				listData[0][0]="10";
//				listData[0][1]="20";

				for (int i = 0; i < rows; i++) {
					for (int j = 0; j < cols; j++) {
						String data = sheet.getRow(i).getCell(j).toString();
						// System.out.println(data);
						listData[i][j] = data;
					}
				}

				//read 2D Array
				for (Object[] i : listData) {
					for (Object str : i) {
						System.out.println(str.toString());
					}
				}
	}

}
