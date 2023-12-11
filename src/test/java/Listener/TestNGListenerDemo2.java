package Listener;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(Listener.TestNGListener.class)
public class TestNGListenerDemo2 {
	
@Test
public static void test4() {
	System.out.println("test 4 ");
}

@Test
public static void test5() {
	System.out.println("test5 ");
	
	Assert.assertTrue(false);
}
@Test
public static void test6() {
	System.out.println("test 6 ");
	throw new SkipException("skip exception");
}



}
