package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchObj {
	
	private static WebElement element=null;
	private static WebDriver dr=null;
	
	static By textS=By.id("APjFqb");
	By bnt=By.id("APjFqb");
	
//	public static WebElement  textS(WebDriver db) {
//		
//	 element=	db.findElement(By.id("APjFqb"));
//	return element;
//	}
	
	public SearchObj(WebDriver db){
		this.dr=db;
	}
//	
	public static void textB( String txt) {
		dr.findElement(textS).sendKeys(txt);
	}


}
