package dd;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.SearchObj;
import config.PropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;

public class testNG {
	
	WebDriver dbs=null;
public static	String brow=null;
	@BeforeTest
	public void setup() {
		PropertiesFile.getProperties();
		 
		 if(brow.equalsIgnoreCase("chrome")) {
			 WebDriverManager.chromedriver().setup();
			    	
			 dbs=new ChromeDriver();
		 }else {
			 WebDriverManager.iedriver().setup();
				
			 dbs=new InternetExplorerDriver(); 
			 
		 }
		
	}

	@Test
	public void test2() throws InterruptedException {
		
		SearchObj searchob1= new SearchObj(dbs);
		 dbs.get("http://www.google.com");

//		  WebElement textbox=searchob.textB("hello");
		  searchob1.textB("tesla");
		  Thread.sleep(4000);
//	    textbox.sendKeys("Youtube");
//	    textbox.click();
		
//	   db.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
		
	}
	
	@AfterTest
	public void endup() {
		PropertiesFile.getProperties();
		dbs.close();
		System.out.print("suscess test 1");
	}
	
	
}
