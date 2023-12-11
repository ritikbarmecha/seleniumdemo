package dd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogTest {

	
	 private static Logger Logger= LogManager.getLogger(LogTest.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World...!   \n");
		Logger.trace("trace msg");
		Logger.info("Infoormantion");
		Logger.error("Error");
		Logger.warn("warning");
		Logger.fatal("Fatal");
		
		System.out.println("\n Completed");

	}

}
