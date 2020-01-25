package ReadDataFromExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataExcel {

	public static void main(String[] args) throws Exception {
		File src = new File("");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh1 = wb.getSheetAt(0);
		System.out.println("Last Row number= "+sh1.getLastRowNum());
		System.out.println("Sheet Name:"+sh1.getSheetName());
		//Get Max Column num present
		Row r = sh1.getRow(0);
		int Max_ColumnValue = r.getLastCellNum();
		//Get Data
		System.out.println(sh1.getRow(0).getCell(0).getStringCellValue());
	}
}
