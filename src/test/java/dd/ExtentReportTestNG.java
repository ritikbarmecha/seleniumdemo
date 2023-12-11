package dd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Pages.SearchObj;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportTestNG {
	 ExtentHtmlReporter htmlReporter;
	 ExtentReports extent;
		WebDriver db=null;
		SearchObj searchob= null;
	 
	
			
	@BeforeSuite
	public void setup() {
		
		  htmlReporter = new ExtentHtmlReporter("extentReportsTestNG.html");
		  extent = new ExtentReports();
	       extent.attachReporter(htmlReporter);
	       WebDriverManager.chromedriver().setup();
			
			 db=	new ChromeDriver();
			 searchob= new SearchObj(db);
	}
	
	@Test
public void test() {
		   ExtentTest test = extent.createTest("Google search", "this is a test valid ");
		   test.log(Status.INFO, "This step shows usage of log(status, details)");
			 test.log(Status.INFO, "start Test       created-------");
		  
			 db.get("http://www.google.com");
			 test.pass("Test 1 pass       created-------");
			 searchob.textB("ears");
			 test.pass("Test 1 pass close       created-------");
			  test.info("Test 1 completed       info-------");
//			  DesiredCapabilities caps=new DesiredCapabilities();
//			  caps.setCapability("killProcessesByName	", false);
//			  db=new ChromeDriver(caps);
	}
	
@AfterSuite
public void endup() {
	
	  db.quit();
	  extent.flush();
	
}
	
	

}
