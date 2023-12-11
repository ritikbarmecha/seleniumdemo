package parameter;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestNGListenerDemo {
	



@Parameters({"myname" ,"age"})
@Test
public static void test4(@Optional("rk")  String myname,int age1) {
	System.out.println(myname +" "+age1);
	
}


}
