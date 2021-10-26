package com.Utility;

import java.io.FileInputStream;



import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Base.BaseClass;


 
public class ExcelUtility extends BaseClass{
FileInputStream fis=null;
Workbook wb=null;
Sheet sh=null;
	public String getCellData(String Filepath,String name,int rownum, int colnum){
		DataFormatter df=new DataFormatter();
	  
		try {
			fis = new FileInputStream(Filepath);
			wb  = WorkbookFactory.create(fis);
		} catch (Exception e) {
			
			e.printStackTrace();
		
		} 
		sh  = wb.getSheet(name);
		Cell c=sh.getRow(rownum).getCell(colnum);
		return df.formatCellValue(c);
	 
	
	}
	
@Test
public void test(){
	String jxlpath=System.getProperty("user.dir")+"/src/test/resources/Book1.xlsx";
	String poipath=System.getProperty("user.dir")+"/src/test/resources/Readingdata.xls";
	System.out.println(getCellData(jxlpath,"Sheet1" ,0, 0));
	System.out.println(getCellData(poipath, "Sheet1" ,0, 0));
	
}
	
	
	
}
	
