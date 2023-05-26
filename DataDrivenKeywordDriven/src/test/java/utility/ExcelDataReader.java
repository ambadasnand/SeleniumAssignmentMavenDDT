package utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataReader {
	
	XSSFWorkbook wb;
	
	public ExcelDataReader() {
		
		File src = new File("C:\\Users\\Admin\\eclipse-workspace\\DataDrivenKeywordDriven\\TestData\\UserDetails.xlsx");
		try {
			
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
			
		} catch (Exception e) {
			
			System.out.println("unable to load Xls file " + e.getMessage());
		}
	}
	
	public String getStringData(int sheetIndex, int row, int column)
	{
		return wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();
	}
	
	public String getStringData(String sheetName, int row, int column)
	{
		return wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
	}
	
	public double getNumericData(String sheetName, int row, int column)
	{
		return wb.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();
	}

}
