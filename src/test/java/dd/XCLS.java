package dd;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.SearchObj;
import io.github.bonigarcia.wdm.WebDriverManager;

public class XCLS {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
	WebDriverManager.chromedriver().setup();
	
	WebDriver db=	new ChromeDriver();
	SearchObj searchob= new SearchObj(db);
	 db.get("http://www.google.com");

//	  WebElement textbox=searchob.textB("hello");
	  searchob.textB("ears");
//    textbox.sendKeys("Youtube");
//    textbox.click();
	  db.quit();
   db.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
   
    
//    Thread.sleep(3000);
	
//	db.get("https://accounts.google.com/v3/signin/identifier?authuser=0&continue=https%3A%2F%2Fmyaccount.google.com%2F%3Futm_source%3Dsign_in_no_continue%26pli%3D1&ec=GAlAwAE&hl=en&service=accountsettings&flowName=GlifWebSignIn&flowEntry=AddSession&dsh=S-855327228%3A1701794723340761&theme=glif");
////    db.findElement(By.cssSelector("#identifierId")).sendKeys("ritik@gmail");
//  
//    db.findElement(By.partialLinkText("more")).click();
  
	}

}
