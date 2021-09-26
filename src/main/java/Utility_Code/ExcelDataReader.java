package Utility_Code;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class ExcelDataReader {

	
	XSSFWorkbook wb;
	public ExcelDataReader() throws IOException {
	
	FileInputStream fil = new FileInputStream("./src/main/java/UilityFiles/CRMData.xlsx");
	wb = new XSSFWorkbook(fil);
	
	}
	
	public String getUserNameData(int sheetindex,int row,int col) {
		
		 return wb.getSheetAt(sheetindex).getRow(row).getCell(col).getStringCellValue();
	}
	
	public String getPassdata(int sheetindex,int row,int col) {
		
		return wb.getSheetAt(sheetindex).getRow(row).getCell(col).getStringCellValue();
	}
	
}
