package Utility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ReadExcel {
	
	public	static	String readExcelFile(int	row,int	col)	throws	Exception
	{
	FileInputStream	file	=	new	FileInputStream("/Users/Zenith/eclipseworkspace/Frame30/TestData/TestData.xlsx");
	Sheet	excelSheet	=	WorkbookFactory.create(file).getSheet("Sheet1");
	String	value	=	excelSheet.getRow(row).getCell(col).getStringCellValue();
	return	value;
	}
}
