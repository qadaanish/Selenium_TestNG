package testNGsession;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practice {


	@BeforeMethod
	public void setup() {
	    System.out.println("Before Method");
	}

	@Test
	public void testA() {
	    System.out.println("Test A");
	}

	@Test
	public void testB() {
	    System.out.println("Test B");
	}

	@Test
	public void testC() {
	    System.out.println("Test C");
	}
}