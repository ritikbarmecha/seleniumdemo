package dd;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.SearchObj;
import io.github.bonigarcia.wdm.WebDriverManager;

public class testNG2 {
	
	WebDriver db=null;
	@BeforeTest
	public void setup() {
	WebDriverManager.chromedriver().setup();
		
		 db=new ChromeDriver();
		
	}

	@Test
	public void test() throws InterruptedException {
		
		SearchObj searchob= new SearchObj(db);
		 db.get("http://www.google.com");

//		  WebElement textbox=searchob.textB("hello");
		  searchob.textB(" step by step ears");
		  Thread.sleep(1000);
//	    textbox.sendKeys("Youtube");
//	    textbox.click();
		
//	   db.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
		
	}
	@Test
	public void test3() throws InterruptedException {
		
		SearchObj searchob= new SearchObj(db);
		 db.get("http://www.google.com");

//		  WebElement textbox=searchob.textB("hello");
		  searchob.textB("test3");
		  Thread.sleep(8000);
//	    textbox.sendKeys("Youtube");
//	    textbox.click();
		
//	   db.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
		
	}
	@AfterTest
	public void endup() {
		
		System.out.print("suscess test2");
	}
	
	
}
