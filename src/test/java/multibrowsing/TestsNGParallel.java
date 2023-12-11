package multibrowsing;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import config.PropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestsNGParallel {
  
	@Parameters("browser")
	@Test
	public void test(String browser) {
		
		 
		 if(browser.equalsIgnoreCase("chrome")) {
			System.out.println("chrome");
		 }else if(browser.equalsIgnoreCase("firefox")) {
				System.out.println("firefox");
			 }
		 else if(browser.equalsIgnoreCase("IE")) {
				System.out.println("interet exp.");
			 
	       }
}
}