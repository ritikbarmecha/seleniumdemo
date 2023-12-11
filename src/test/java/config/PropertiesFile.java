package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import dd.testNG;

public class PropertiesFile {
	
	static	 Properties prop=new Properties();
	 static	   String path=   System.getProperty("user.dir");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
  getProperties();

 setProperties();
  getProperties();
	}
	public static void getProperties() {
		// TODO Auto-generated method stub
    
      //read
      try {
		InputStream input=new FileInputStream(path+"/src/test/java/config/config.properties");
		prop.load(input);
	String br=	prop.getProperty("browser");
	System.out.println(br);
     testNG.brow=br;
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
	}
	
	public static void setProperties() {
		try {
			OutputStream output=new FileOutputStream(path+"/src/test/java/config/config.properties");
			prop.setProperty("result","passx");	
			prop.store(output, null);
		}catch (Exception e) {
			// TODO Auto-generated catch block
			
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	
		
		
	}
	
	
	

}
