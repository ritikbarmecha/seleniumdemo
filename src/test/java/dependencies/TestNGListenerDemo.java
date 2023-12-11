package dependencies;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Ignore;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class TestNGListenerDemo {
@Ignore	
@Test(dependsOnGroups =   {"tesla"} )
public static void test1() {
	System.out.println("test 1 ");
}


@Test(groups= {"tesla"})
public static void test2() {
	System.out.println("test2 ");

}

@Ignore
@Test
public static void test3() {
	System.out.println("test 3 ");
	
}

@Test
public static void test4() {
	System.out.println("test 4");
	
}

}
