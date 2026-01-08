package testNGsession;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartTest extends BaseTest{
 
	@Test 
	public void openCartTitle() {
		String title = driver.getTitle();
		System.out.println("Title is  " + title);
		Assert.assertEquals(title,  " Register Account");
	}
	
	@Test 
	public void openCartURL() {
		String actucalURL = driver.getCurrentUrl();
		Assert.assertTrue(actucalURL.contains( "opencart"));
		System.out.println("URL is " + actucalURL);
	}
}
