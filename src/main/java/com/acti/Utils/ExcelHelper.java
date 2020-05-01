package com.acti.Utils;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHelper {
	XSSFWorkbook excel;
	
	public ExcelHelper()
	{
		try
		{
			File src = new File("./TestData/TestData.xlsx");
			FileInputStream fis = new FileInputStream(src);
			excel = new XSSFWorkbook(fis);
		}
		catch(Exception e)
		{
			System.out.println("Excel sheet Failed to load " +e.getMessage()); 
		}
	}
	//Get the count of active rows
	public int getRowCount(int sheetNum)
	{
		return excel.getSheetAt(sheetNum).getLastRowNum()+1;
	}
	public int getRowCount1(String sheetname)
	{
		return excel.getSheet(sheetname).getLastRowNum()+1;
	}
	//Get the Value from the cell
	public String getcelldata(int sheetnum,int row,int col)
	{
		return excel.getSheetAt(sheetnum).getRow(row).getCell(col).toString();
	}
	

}
