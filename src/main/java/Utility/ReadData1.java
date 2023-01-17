package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData1 {
	public static String readPropertyFile(String value) throws Exception
	{
		Properties p = new Properties();
		FileInputStream  file = new FileInputStream("C:\\Users\\Prajakta\\eclipse-workspace\\Project17sep\\TestData\\config.properties");
		p.load(file);
		return p.getProperty(value);
		
	}
	public  static String readExcelData(int i , int j) throws Exception
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Prajakta\\eclipse-workspace\\Project17sep\\TestData\\data.xlsx");
	Sheet excel = WorkbookFactory.create(file).getSheet("sheet1");
		String value = excel.getRow(i).getCell(j).getStringCellValue();
		return value;
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
