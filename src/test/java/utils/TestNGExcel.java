package utils;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGExcel {
    @Test(dataProvider="test1data")
	public static void test1( String username ,String password) {
		System.out.println(username+"TesdNG "+password);
		
	}
	
	@DataProvider(name="test1data")
	public static Object[][] getData() {
		Object data[][]= getExcelData();
		return data;
		
	}
	
	
	public static Object[][] getExcelData() {
		
		Excel excel=new Excel();
		
		int row=2;
		int col=2;
		Object data[][]=new Object[row-1][col];
		
		for(int i=1;i<row;i++) {
			
			for(int j=0;j<col;j++) {
				String value=excel.getCellDataString(i, j);		
			      	data[i-1][j]=value;
			}
		}
		
		return data;
	}
	
	
}
