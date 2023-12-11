package headless;

import java.io.IOException;

import org.apache.hc.client5.http.async.methods.IgnoreCompleteExceptionFutureCallback;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import Pages.SearchObj;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		
		
	//implicit wait	
//		db.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		
//		  WebElement textbox=searchob.textB("hello");
//		  searchob.textB("ears");
//	    textbox.sendKeys("Youtube");
//	    textbox.click();
		 
		//exlipcit wait 
//		  	WebDriverWait wait=new WebDriverWait(db,10);
//		  	WebElement element=wait.until(ExpectedConditions.elementToBeClickable(By.name("qsd")));
//		  db.findElement(By.id("APjFqb")).sendKeys(
	
		
		 WebDriverManager.chromedriver().setup();
		 WebDriver db=new ChromeDriver();
		 
		 db.get("https://smallpdf.com/pdf-converter#r=convert");
		 db.findElement(By.xpath("//header/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/form[1]/label[1]/div[1]/div[1]/div[2]/div[1]/button[1]/div[1]/div[1]/div[1]/*[1]")).click();
		 System.out.println("google paage");
		 Runtime.getRuntime().exec("C:\\Users\\ritik barmecha\\Pictures\\Screenshots\\FileuploadAutoScript3.exe");
		Thread.sleep(3000);
		
		 
//		 db.findElement(By.name("q")).sendKeys("Auto");
//		 db.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		 db.close();
		 
		 db.quit();
		 System.out.println("completed");
		 
		 
		 
	}

}
