package Priority;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class TestNGListenerDemo {
	
@Test(priority=1)
public static void test1() {
	System.out.println("test 1 ");
}

@Test
public static void test2() {
	System.out.println("test2 ");

}
@Test(priority=2)
public static void test3() {
	System.out.println("test 3 ");
	
}



}
