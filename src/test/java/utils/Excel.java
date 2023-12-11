package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
 static String path;
 static XSSFWorkbook workbook;
 static XSSFSheet sheet;
   public Excel() {
	   
	   
   }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getRowCount();
		getCellDataString(0,0);
		getCellDataNumeric(1,1);
	}
	
	public static void getRowCount() {
		// TODO Auto-generated method stub
        
	try {
		path=System.getProperty("user.dir");
		 workbook = new XSSFWorkbook(path+"/ecel/data.xlsx");
		 sheet=workbook.getSheet("sheet1");
	   int rows=sheet.getPhysicalNumberOfRows();
		System.out.println("number iof rows "+ rows);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.print(e.getMessage());
		e.printStackTrace();
	}
       
	}
	
	
	public static String getCellDataString(int row,int col) {
		// TODO Auto-generated method stub
        String ans="";
	try {
		 path=System.getProperty("user.dir");
		workbook = new XSSFWorkbook(path+"/ecel/data.xlsx");
       sheet=workbook.getSheet("sheet1");
	   String data=sheet.getRow(row).getCell(col).getStringCellValue();
		System.out.println("data iof rows "+ data);
		ans=data;
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.print(e.getMessage());
		e.printStackTrace();
	}
       
	return ans;
	}

	public static void getCellDataNumeric(int row,int col) {
		// TODO Auto-generated method stub
        
	try {
		 path=System.getProperty("user.dir");
		workbook = new XSSFWorkbook(path+"/ecel/data.xlsx");
       sheet=workbook.getSheet("sheet1");
	   double data=sheet.getRow(row).getCell(col).getNumericCellValue();
		System.out.println("data iof rows "+ data);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.print(e.getMessage());
		e.printStackTrace();
	}
       
	}

}
