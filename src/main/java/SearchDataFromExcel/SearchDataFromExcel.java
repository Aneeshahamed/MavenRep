package SearchDataFromExcel;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class SearchDataFromExcel {
	static File src;
	static FileInputStream fis;
	static XSSFWorkbook wb;
	static XSSFSheet sh1;
	
	public static void main(String[] args) throws Exception {
		
		File src = new File("C:\\Users\\Aneesh Ahamed\\Desktop\\Test Data.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		sh1 = wb.getSheetAt(0);
		System.out.println("Last Row number= "+sh1.getLastRowNum());
		System.out.println("Sheet Name:"+sh1.getSheetName());
		//Get Max Column num present
		Row r = sh1.getRow(0);
		int Max_ColumnValue = r.getLastCellNum();
		String Column_Name = "MDN";
		//Get cell value
		for(int i =0; i <= sh1.getLastRowNum(); i++)
		{
			for(int j =0; j <= Max_ColumnValue; j++)
			{
				try 
				{
					if(sh1.getRow(i).getCell(j).getStringCellValue().equals("MDN"))
					{
						int MDN_Row = i+1;
						int MDN_Column = j;							
						Filtering_MDN(MDN_Row, MDN_Column);
					}
				}
				catch(Exception e)
				{
					
				}				
			}
		}
	}
	private static void Filtering_MDN(int mDN_Row, int mDN_Column) {
		try 
		{
			for(int k = mDN_Row; k<=sh1.getLastRowNum(); k++)
			{
				String MDN_Data = sh1.getRow(k).getCell(mDN_Column).getRawValue();
				if(!MDN_Data.isEmpty())
				{
					String[] array_mdn = new String[40];
					array_mdn[k] = MDN_Data;
					System.out.println(array_mdn[k]);
				}
			}	
		}
		catch(Exception ex)
		{
//			ex.printStackTrace();
		}		
	}
}