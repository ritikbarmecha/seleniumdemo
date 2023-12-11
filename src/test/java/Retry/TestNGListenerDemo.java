package Retry;

import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.SkipException;
import org.testng.annotations.Ignore;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class TestNGListenerDemo {

@Test()
public static void test1() {
	System.out.println("test 1 ");
}


@Test
public static void test2() {
	System.out.println("test2 ");
	

}


@Test(retryAnalyzer = Listener.RetryAnalyzerDemo.class)
public static void test() {
	System.out.println("test 3 ");
	Assert.assertTrue(false);
	
}

@Test
public static void test4() {
	System.out.println("test 4");
	
}

}
