package groups;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Test(groups={"rohit"})
public class TestNGListenerDemo {
	
@Test(groups={"sanity","reger","unit"})
public static void test1() {
	System.out.println("test 1 ");
}

@Test(groups={"sanity","unit","windows.regression"})
public static void test2() {
	System.out.println("test2 ");

}
@Test(groups={"sanity","reger","linux.regression"})
public static void test3() {
	System.out.println("test 3 ");
	
}

@Test
public static void test4() {
	System.out.println("test 4");
	



}
}
