package Listener;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(Listener.TestNGListener.class)
public class TestNGListenerDemo {
	
@Test
public static void test1() {
	System.out.println("test 1 ");
}

@Test
public static void test2() {
	System.out.println("test2 ");
	
	Assert.assertTrue(false);
}
@Test
public static void test3() {
	System.out.println("test 3 ");
	throw new SkipException("skip exception");
}



}
