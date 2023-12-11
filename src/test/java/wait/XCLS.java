package wait;




import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.SearchObj;
import io.github.bonigarcia.wdm.WebDriverManager;

public class XCLS {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
	WebDriverManager.chromedriver().setup();
	
	WebDriver db=	new ChromeDriver();
	
//implicit wait	
//	db.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	SearchObj searchob= new SearchObj(db);
	 db.get("http://www.google.com");
  
//	  WebElement textbox=searchob.textB("hello");
//	  searchob.textB("ears");
//    textbox.sendKeys("Youtube");
//    textbox.click();
	 
	//exlipcit wait 
//	  	WebDriverWait wait=new WebDriverWait(db,10);
//	  	WebElement element=wait.until(ExpectedConditions.elementToBeClickable(By.name("qsd")));
	  db.findElement(By.name("qsd")).sendKeys(Keys.ENTER);
	  

		   
		   
		 
	  	
	  
       
  db.quit();
   
    
//    Thread.sleep(3000);
	
//	db.get("https://accounts.google.com/v3/signin/identifier?authuser=0&continue=https%3A%2F%2Fmyaccount.google.com%2F%3Futm_source%3Dsign_in_no_continue%26pli%3D1&ec=GAlAwAE&hl=en&service=accountsettings&flowName=GlifWebSignIn&flowEntry=AddSession&dsh=S-855327228%3A1701794723340761&theme=glif");
////    db.findElement(By.cssSelector("#identifierId")).sendKeys("ritik@gmail");
//  
//    db.findElement(By.partialLinkText("more")).click();
  
	}

}
