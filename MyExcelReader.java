import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/**
 * @author suba
 *
 */
public class MyExcelReader {
	
	XSSFWorkbook wb;
	XSSFSheet sheet1;	
	XSSFRow row = null;
	XSSFCell cell = null;
	
	/*
	 *  Example (excelPath) D:\\excel-reader-selenium-automation\\testdata\\mydatas.xlsx
	*/
	public MyExcelReader(String excelPath)
	{
		try
		{
			File src= new File(excelPath);
			FileInputStream fis= new FileInputStream(src);
			wb= new XSSFWorkbook(fis);
			sheet1= wb.getSheetAt(0);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	
	
	
	public String getData(int sheetNumber, int row, int column)
	{
		String data= wb.getSheetAt(sheetNumber).getRow(row).getCell(column).getStringCellValue();
		return data;
	}
	
	
	
	
	public int getRowCount(int sheetNo)
   {
       sheet1 = wb.getSheetAt(sheetNo);
       int rowCount = sheet1.getLastRowNum()+1;
       return rowCount;
   }
			 
   public int getColumnCount(int sheetNo)
   {
       sheet1 = wb.getSheetAt(sheetNo);
       row = sheet1.getRow(0);
       int colCount = row.getLastCellNum();
       return colCount;
   }
}
