package dd;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Pages.SearchObj;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtendReports {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       WebDriverManager.chromedriver().setup();
		
		WebDriver db=	new ChromeDriver();
		SearchObj searchob= new SearchObj(db);
		
		 ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");
		 ExtentReports extent = new ExtentReports();
	       extent.attachReporter(htmlReporter);
	      ExtentTest test = extent.createTest("Google search", "this is a test valid ");
	      
	  	
		 test.log(Status.INFO, "This step shows usage of log(status, details)");
		 test.log(Status.INFO, "start Test       created-------");
	  
		 db.get("http://www.google.com");
		 test.pass("Test 1 pass       created-------");
		 
//		  WebElement textbox=sear
//		 chob.textB("hello");
		  searchob.textB("ears");
//	    textbox.sendKeys("Youtube");
//	    textbox.click();
		  
		 

		  
		  
		  ExtentTest test2 = extent.createTest("Google search 2", "this is a test 2 valid ");
	      
		  	
			 test2.log(Status.INFO, "This step shows usage of log(status, details)");
			 test2.log(Status.INFO, "start Test       created-------");
		  	
			 db.get("http://www.google.com");
			 test2.pass("Test 2 pass       created-------");
			 
//			  WebElement textbox=sear
//			 chob.textB("hello");
			  searchob.textB("ears");
//		    textbox.sendKeys("Youtube");
//		    textbox.click();
			  db.quit();
			  test2.fail("Test 2 fail close       created-------");
			  test.info("Test 2 completed       info-------");
		  
		  extent.flush();
	       
	      

	}

}
