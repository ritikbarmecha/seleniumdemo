package wait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import Pages.SearchObj;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Fluentwait {

	public static void main(String[] args) {
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
//	  db.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
	 
	 
	  
	  FluentWait<WebDriver> wait=new FluentWait<WebDriver>(db);
	  wait.withTimeout(Duration.ofSeconds(6));
	  wait.pollingEvery(Duration.ofSeconds(2));
	  wait.until(ExpectedConditions.elementToBeClickable(By.id("btnK")));
	  wait.ignoring(NoSuchElementException.class);
			  
//	 	  Wait<WebDriver> wait = new FluentWait<WebDriver>(db)
//		       .withTimeout(Duration.ofSeconds(20L))
//		       .pollingEvery(Duration.ofSeconds(2L))
//		       .ignoring(NoSuchElementException.class);
//
//		   WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
//		     public WebElement apply(WebDriver db) {
//		      
//		       
//		       WebElement lk=db.findElement(By.name("qsd"));
//		         
//		         if(lk.isEnabled()) {
//		        	 System.out.println("Element Found");
//		         }else {
//		        	 System.out.println("Element Not Found"); 
//		         }
//		         return lk;
//		     }
//		   });

	 
	 
	 
	 
//	   Wait<WebDriver> wait = new FluentWait<WebDriver>(db)
//		       .withTimeout(30, TimeUnit.SECONDS)
//		       .pollingEvery(2, TimeUnit.SECONDS)
//		       .ignoring(NoSuchElementException.class);
//
//		   WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
//		     public WebElement apply(WebDriver db) {
//		         
//		     }
//		   });	   
//	   foo.sendKeys(Keys.ENTER);
		 
	  	
	  
       
     db.quit();

	}

}
